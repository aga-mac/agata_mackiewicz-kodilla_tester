package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 2;
        int addResult = calculator.add(a, b);
        boolean correctAdd = ResultChecker.assertEquals(13, addResult);
        if (correctAdd) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, addResult);
        if (correctSub) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squareResult = calculator.square(a, c);
        boolean correctSquare = ResultChecker.assertEquals(25, (int) squareResult);
        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}
