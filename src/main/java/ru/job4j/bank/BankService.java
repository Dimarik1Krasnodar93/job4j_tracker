package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Описывает банковский сервис
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет пользователя
     * @param user - пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавляет аккаунт
     * @param passport - паспорт
     * @param account - аккаунт
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
              List<Account> listAcc = users.get(user.orElse(null));
            if (!listAcc.contains(account)) {
                listAcc.add(account);
            }
        }
    }

    /**
     * Осуществляет поиск по паспорту
     * @param passport - паспорт
     * @return - возвращает найденного пользователя или Null если пользователя не нашли
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(e -> passport.equals(e.getPassport()))
                .findFirst();
    }

    /**
     * Ищет аккаунт по реквизиту и паспорту
     * @param passport - паспорт
     * @param requisite - номер счета
     * @return возвращает аккаунт  пользователя или Null если не нашли
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> rsl = null;
        Optional<User> user  = findByPassport(passport);
        if (user.isPresent()) {
            rsl = Optional.of(users.get(user.orElse(null))
                    .stream()
                    .filter(e -> e.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null));
        }
        return rsl;
    }

    /**
     * Осуществляет перевд денежных средств
     * @param srcPassport паспортотправителя
     * @param srcRequisite номер счета отправителя
     * @param destPassport паспорт поулчателя
     * @param destRequisite номер счета получателя
     * @param amount количество денежных средств которые хотим перевести
     * @return возвращает Истина в случае успеха, ложь если не получился перевод
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAcc = findByRequisite(srcPassport, srcRequisite).orElse(null);
        Account destAcc = findByRequisite(destPassport, destRequisite).orElse(null);
        boolean rsl = false;
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}