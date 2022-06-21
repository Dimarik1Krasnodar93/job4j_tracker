package ru.job4j.stream;

import java.nio.channels.Pipe;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .mapToInt(x -> x.getScore())
                .sum() / stream.count();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(x.getName(), averageScore(stream.filter(t -> t == x))))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors::averagingDouble))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), (int) x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors::summingInt))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), (int) x.getValue()))
                .sorted(Comparator.comparing(Tuple::getScore))
                .findFirst();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors::summingDouble))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), (int) x.getValue()))
                .sorted(Comparator.comparing(Tuple::getScore))
                .orE;
    }
}
