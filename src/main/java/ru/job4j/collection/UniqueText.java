package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String strOrigin : origin) {
            check.add(strOrigin);
        }
        for (String duplWord : text) {
            if (!check.contains(duplWord)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}