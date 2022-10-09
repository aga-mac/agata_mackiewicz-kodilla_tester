package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi(160));
        cars.add(new Fiat(70));
        cars.add(new Skoda(100));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        Car audi = new Audi(160);
        cars.remove(audi);

        System.out.println(cars.size());


    }

}
