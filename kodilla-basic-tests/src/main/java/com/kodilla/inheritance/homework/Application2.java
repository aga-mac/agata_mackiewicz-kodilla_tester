package com.kodilla.inheritance.homework;

public class Application2 {
    public static void main(String[] args) {
        IOS ios = new IOS(2007);
        ios.getYearOfRelease();
        ios.turnOn();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.getYearOfRelease();
        windows.turnOff();
    }
}
