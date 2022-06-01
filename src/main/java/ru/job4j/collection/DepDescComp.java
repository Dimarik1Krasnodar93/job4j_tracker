package ru.job4j.collection;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        for (int i = 0; i < Math.min(s1.length, s2.length); i++) {
            if (!s1[i].equals(s2[i])) {
                return s1[i].compareTo(s2[i]) * ((i == 0) ? -1 : 1);
            }
        }
        return Integer.compare(s1.length, s2.length);
    }
}
