package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] strArrayLeft = left.split("\\.");
        String[] strArrayRight = right.split("\\.");
        return Integer.compare(Integer.parseInt(strArrayLeft[0]), Integer.parseInt(strArrayRight[0]));
    }
}
