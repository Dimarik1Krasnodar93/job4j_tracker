package ru.job4j.encapsulation;

public class Config {
    String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    private void print() {
        System.out.println(position);
    }

    private String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
