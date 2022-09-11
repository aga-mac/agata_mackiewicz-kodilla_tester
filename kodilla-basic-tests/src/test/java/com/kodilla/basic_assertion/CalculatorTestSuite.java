package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd () {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int addResult = calculator.add(a, b);
        assertEquals(14, addResult);
    }

    @Test
    public void testSub () {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquareAbove () {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = (int) calculator.square(5, 2);
        assertEquals(25, squareResult,0.01 );
    }
    @Test
    public void testSquareZero () {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = (int) calculator.square(0, 2);
        assertEquals(0, squareResult,0.01 );
    }
    @Test
    public void testSquareBelow () {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = (int) calculator.square(-5, 2);
        assertEquals(25, squareResult,0.01 );
    }
}
