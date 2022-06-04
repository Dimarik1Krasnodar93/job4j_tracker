package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MyClass {

   static List<Double> diapason(int start, int end, Function<Double, Double> funct) {
        List<Double> res = new ArrayList<>();
        for (int i = start; i < end; i++) {
            res.add(funct.apply((double) i));
        }
        return res;
    }

}
