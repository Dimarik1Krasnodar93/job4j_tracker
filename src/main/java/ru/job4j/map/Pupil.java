package ru.job4j.map;

import java.util.List;

public record Pupil(String name, List<Subject> subjects) {
    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name();
    }
}