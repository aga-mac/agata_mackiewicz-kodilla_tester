package com.kodilla.inheritance.homework;

public class IOS extends OperatingSystem {
    public IOS(int yearOfRelease) {
        super(yearOfRelease);
        System.out.println("Welcome into ISO world.");
    }
    @Override
    public void turnOn() {
        System.out.println("IOS Turning on..");
    }
    @Override
    public void turnOff() {
        System.out.println("IOS Turning off..");
    }
}
