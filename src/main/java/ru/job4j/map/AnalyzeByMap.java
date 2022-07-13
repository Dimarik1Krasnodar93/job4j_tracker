package ru.job4j.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        Map<Pupil, Double> hmPupil = getHMPupil(pupils);
        for (Map.Entry entry : hmPupil.entrySet()) {
            rsl += (double)entry.getValue() / hmPupil.entrySet().size();
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return List.of();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        Map<Pupil, Double> hmPupil = getHMPupil(pupils);
        List<Label> rsl = new ArrayList<>();
        for (Map.Entry entry : hmPupil.entrySet()) {
            Pupil pulil = entry.getKey();
            rsl.add( (Pupil)entry.getKey(), (double)entry.getValue());
        }
        return List.of();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return null;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return null;
    }

    private static HashMap<Pupil, Double> getHMPupil(List<Pupil> pupils) {
        Map<Pupil, Double> rsl = new HashMap<>();
        for (Pupil pupil : pupils) {
            double dScore = 0;
            for (Subject subject : pupil.getSubjects()) {
                dScore += subject.getScore();
            }
            rsl.put(pupil, dScore / pupil.getSubjects().size());
        }
        return rsl;
    }

    private static HashMap<Subject, Double> getHMSubject(List<Pupil> pupils) {
        HashMap<Subject, Double> rsl = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                double iScore = rsl.get(subject) != 0 ? rsl.get(subject) : 0;
                rsl.put(subject,  iScore + subject.getScore());
            }
        }
        return rsl;
    }
}
