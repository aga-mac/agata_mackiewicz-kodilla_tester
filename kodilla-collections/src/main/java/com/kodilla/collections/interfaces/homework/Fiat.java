package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    public int speed;

    public Fiat (int speed) {
        this.speed = speed;
    }


    @Override
    public void getIncreaseSpeed() {
        speed += 25;
    }

    @Override
    public void getDecreaseSpeed() {
        speed -= 15;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
