package com.kodilla.collectiond.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        Principal matthew = new Principal("Matthew", "Novak");
        Principal jackson = new Principal("Jackson", "Avery");
        Principal miranda = new Principal("Miranda", "Bailey");

        School matthewsSchool = new School(Arrays.asList(25, 27, 32, 19));
        School jacksonsSchool = new School(Arrays.asList(17, 12, 21, 19));
        School mirandasSchool = new School(Arrays.asList(30, 26, 19, 22));

        directory.put(matthew, matthewsSchool);
        directory.put(jackson, jacksonsSchool);
        directory.put(miranda, mirandasSchool);

        for(Map.Entry<Principal, School> principalEntry : directory.entrySet())
            System.out.println("Principal: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + " is head of " +
                    principalEntry.getValue().toString() + ". Total amount of students is: " +principalEntry.getValue().getSum());
    }
}
