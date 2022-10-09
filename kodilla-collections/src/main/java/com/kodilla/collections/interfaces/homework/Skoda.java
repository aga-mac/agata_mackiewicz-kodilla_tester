package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skoda skoda = (Skoda) o;
        return speed == skoda.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
