package ru.job4j.collection;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char chLeft = left.charAt(i);
            if (i > right.length() - 1) {
                result = chLeft;
                break;
            } else if (chLeft == right.charAt(i)) {
                continue;
            } else {
                result = Character.compare(chLeft, right.charAt(i));
                break;
            }
        }
        if (result == 0 && right.length() > left.length()) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }

}