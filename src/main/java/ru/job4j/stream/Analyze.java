package ru.job4j.stream;

import com.sun.source.tree.Scope;

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
                .average().orElse(0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        List<Tuple> rsl = stream.map(x -> new Tuple(x.getName(),
                x.getSubjects().stream().mapToInt(Subject::getScore).average().orElse(0D)))
                .collect(Collectors.toList());
        return rsl;
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
                return stream
                        .map(x -> new Tuple(x.getName(),
                                x.getSubjects()
                                        .stream()
                                        .mapToInt(Subject::getScore)
                                        .sum()))
                        .max(Comparator.comparingDouble(x -> x.getScore()))
                        .orElse(new Tuple("null", 0));

    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .collect((Collectors.groupingBy(y -> y.getName(), LinkedHashMap::new, Collectors.summingDouble(y -> y.getScore()))))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .max(Comparator.comparingDouble(x -> x.getScore()))
                .orElse(new Tuple("null", 0));
    }
}
