package com.kodilla.abstracts.homework;

public class Teacher extends Job{

    public Teacher() {
        super(4000, "taking care of kids, teaching");
    }

    @Override
    public void jobResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
