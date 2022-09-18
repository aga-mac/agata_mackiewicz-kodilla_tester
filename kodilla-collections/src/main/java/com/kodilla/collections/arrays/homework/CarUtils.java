package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarBrand(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car name";
    }
}
