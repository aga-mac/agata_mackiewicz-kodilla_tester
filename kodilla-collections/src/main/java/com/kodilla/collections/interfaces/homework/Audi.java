package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{
    public int speed;

    public Audi (int speed) {
        this.speed = speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed += 55;
    }

    @Override
    public void getDecreaseSpeed() {
        speed -= 20;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
