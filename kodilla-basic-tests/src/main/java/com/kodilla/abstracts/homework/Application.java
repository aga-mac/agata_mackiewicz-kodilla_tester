package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(6);
        System.out.println("Square surface is " + square.getSurface() + " and square circuit is " + square.getCircuit() + ".");

        Triangle triangle = new Triangle(3.5, 7, 6, 3.5);
        System.out.println("Triangle surface is " + triangle.getSurface() + " and triangle circuit is " + triangle.getCircuit() + ".");

        Trapezium trapezium = new Trapezium(4, 7, 5, 5, 3.5);
        System.out.println("Trapezium surface is " + trapezium.getSurface() + " and trapezium circuit is " + trapezium.getCircuit() + ".");
    }
}
