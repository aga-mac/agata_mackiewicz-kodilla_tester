package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{
    public int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    @Override
    public void getIncreaseSpeed() {
        speed += 30;
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
