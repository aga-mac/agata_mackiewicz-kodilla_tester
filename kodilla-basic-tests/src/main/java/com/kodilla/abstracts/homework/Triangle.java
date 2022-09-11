package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double triangleSide1;
    private double triangleSide2;
    private double base;
    private double height;

    public Triangle(double triangleSide1, double triangleSide2, double base, double height) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return base * height * 0.5;
    }

    @Override
    public double getCircuit() {
        return triangleSide1 + triangleSide2 + base;
    }
}
