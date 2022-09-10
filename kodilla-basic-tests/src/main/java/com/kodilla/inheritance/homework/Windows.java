package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int yearOfRelease) {
        super(yearOfRelease);
        System.out.println("Welcome into Windows world.");
    }
    @Override
    public void turnOn() {
        System.out.println("Windows Turning on..");
    }
    @Override
    public void turnOff() {
        System.out.println("Windows Turning off..");
    }
}
