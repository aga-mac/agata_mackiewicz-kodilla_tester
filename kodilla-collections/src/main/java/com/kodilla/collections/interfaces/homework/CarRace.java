package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Audi audi = new Audi(120);
        doRace(audi);

        Fiat fiat = new Fiat(50);
        doRace(fiat);

        Skoda skoda = new Skoda(75);
        doRace(skoda);
    }
    private static void doRace(Car car) {
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getIncreaseSpeed();
        car.getDecreaseSpeed();
        car.getDecreaseSpeed();
        System.out.println("Final car speed is " + car.getSpeed());
    }
}
