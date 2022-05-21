package ru.job4j.bank;

import java.util.Comparator;
import java.util.Objects;

/**
 * Описывает пользователя
 */
public class User implements Comparable<User> {
    private String passport;
    private String username;
    private String name;
    private int age;

    /**
     * Создаем пользователя
     * @param passport - паспорт
     * @param username - имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * получаем возраст
     * @return возрат
     */
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        int rsl = name.compareTo(o.getUsername());
        return rsl != 0 ? rsl : Integer.compare(age, o.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * получаем паспорт
     * @return
     */
    public String getPassport() {
        return passport;
    }

    /**
     * устанавливаем паспорт
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * получаем имя пользователя
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * устанавливаем имя пользователя
     * @param username - имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }
}