package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiat fiat = (Fiat) o;
        return speed == fiat.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
