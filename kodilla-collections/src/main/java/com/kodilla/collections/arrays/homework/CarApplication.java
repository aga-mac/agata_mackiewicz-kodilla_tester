package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {

        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        Car car;

        if (drawnCarKind == 0) {
            car = new Audi(140);
        } else if (drawnCarKind == 1)
            car = new Fiat(60);
        else {
            car = new Skoda(90);
        }
        int count = random.nextInt(3) + 1;
        for (int i = 0; i < count; i++) {
            car.getIncreaseSpeed();
        }
        return car;
    }
}


