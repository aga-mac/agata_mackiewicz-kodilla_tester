package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Fireman fireman = new Fireman();
        Nurse nurse = new Nurse();
        Teacher teacher = new Teacher();

        Person henry = new Person("Henry", 27, fireman);
        Person elizabeth = new Person ("Elizabeth", 45, nurse);
        Person hank = new Person("Hank", 31, teacher);

        henry.getJob().jobResponsibilities();
        elizabeth.getJob().jobResponsibilities();
        hank.getJob().jobResponsibilities();
    }
}
