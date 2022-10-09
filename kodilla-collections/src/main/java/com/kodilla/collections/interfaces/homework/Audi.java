package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
