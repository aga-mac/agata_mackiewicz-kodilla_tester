package com.kodilla.abstracts.homework;

public class Person {
    private int age;
    private String name;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }
}
