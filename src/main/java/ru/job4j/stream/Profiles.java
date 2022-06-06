package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.function.*;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream().sorted(new Comparator<Profile>() {
            @Override
            public int compare(Profile o1, Profile o2) {
                return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
            }
        }).map(x -> x.getAddress()).distinct().collect(Collectors.toList());
    }
}