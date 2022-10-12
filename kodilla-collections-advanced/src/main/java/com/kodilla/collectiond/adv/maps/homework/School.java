package com.kodilla.collectiond.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(List<Integer> numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getSum() {
        int sum = 0;
        for (int n : numberOfStudents) {
            sum += n;
        } return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                '}';
    }
}
