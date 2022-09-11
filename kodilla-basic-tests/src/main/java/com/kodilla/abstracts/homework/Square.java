package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }
    @Override
    public double getSurface() {
        return squareSide * squareSide;
    }

    @Override
    public double getCircuit() {
        return squareSide * 4;
    }
}
