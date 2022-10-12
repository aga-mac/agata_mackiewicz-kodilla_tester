package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Eiffel Tower","25x31", true));
        stamps.add(new Stamp("Tower Bridge", "26x40", false));
        stamps.add(new Stamp("Acropolis", "25x31", true));
        stamps.add(new Stamp("Tower Bridge", "26x40", false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
