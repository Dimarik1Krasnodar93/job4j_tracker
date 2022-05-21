package ru.job4j.bank;

import java.util.Objects;

public class Account {
    private String requisite;
    private double balance;

    /**
     * Описывает работу аккаунта банковсгко счета
     * @param requisite содержит номер счета
     * @param balance содержит баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     *Возвращает номер счета
     * @return номер счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает номер счета
     * @param requisite номер счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Получает баланс
     * @return - баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает баланс
     * @param balance - баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}