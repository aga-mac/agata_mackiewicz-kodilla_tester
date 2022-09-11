package com.kodilla.abstracts.homework;

public class Fireman extends Job {

    public Fireman() {
        super(5000, "putting fire out, taking kittens down from trees");
    }

    @Override
    public void jobResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
