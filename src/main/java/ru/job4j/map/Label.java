package ru.job4j.map;

public record Label(String name, double score) {
    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}