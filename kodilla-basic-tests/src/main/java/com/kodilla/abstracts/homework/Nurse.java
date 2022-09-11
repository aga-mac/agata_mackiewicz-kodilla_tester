package com.kodilla.abstracts.homework;

public class Nurse extends Job{

    public Nurse() {
        super(3000, "taking care of patients, putting on IV's");
    }

    @Override
    public void jobResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
