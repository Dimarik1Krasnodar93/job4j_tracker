package ru.job4j.bank;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    private String passport;
    private String username;
    private String name;
    private int age;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

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

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

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