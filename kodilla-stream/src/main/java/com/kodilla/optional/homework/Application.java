package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentsTeachers = new ArrayList<>();
        studentsTeachers.add(new Student("Anna Wieczorek", new Teacher("Alicja Nowak")));
        studentsTeachers.add(new Student("Alina Gruszka", new Teacher("Tomasz Nowacki")));
        studentsTeachers.add(new Student("Daniel Poranek", null));
        studentsTeachers.add(new Student("Karol Karolak", null));
        studentsTeachers.add(new Student("Kamila Pietruszka", new Teacher("Tomasz Nowacki")));

        for(Student student : studentsTeachers) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teachersName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teachersName + ".");
        }
    }
}
