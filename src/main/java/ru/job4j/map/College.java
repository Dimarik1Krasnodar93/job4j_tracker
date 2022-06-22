package ru.job4j.map;

import java.util.Map;
import java.util.Set;
import java.util.Optional;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s : students.keySet()) {
            if (s.getAccount().equals(account)) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

    public  Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> a = findByAccount(account);
        if (a.isPresent()) {
            Set<Subject> subjects = students.get(a.get());
            if (subjects != null) {
                for (Subject s : subjects) {
                    if (s.getName().equals(name)) {
                        rsl = Optional.of(s);
                        break;
                    }
                }
            }
        }
        return rsl;
    }
}