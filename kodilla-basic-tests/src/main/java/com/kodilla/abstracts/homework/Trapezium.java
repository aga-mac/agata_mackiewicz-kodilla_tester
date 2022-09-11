package com.kodilla.abstracts.homework;

public class Trapezium extends Shape {
    private double trapeziumSide1;
    private double trapeziumSide2;
    private double trapeziumSide3;
    private double trapeziumSide4;
    private double height;

    public Trapezium(double trapeziumSide1, double trapeziumSide2, double trapeziumSide3, double trapeziumSide4, double height) {
        this.trapeziumSide1 = trapeziumSide1;
        this.trapeziumSide2 = trapeziumSide2;
        this.trapeziumSide3 = trapeziumSide3;
        this.trapeziumSide4 = trapeziumSide4;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return (trapeziumSide1 + trapeziumSide2) * height /2;
    }

    @Override
    public double getCircuit() {
        return trapeziumSide1 + trapeziumSide2 + trapeziumSide3 + trapeziumSide4;
    }
}
