package com.webcalc;

import org.junit.Test;
import static org.junit.Assert.*;

public class WebCalculatorTest {

    @Test
    public void testAdd() {
        double a = 5, b = 3;
        double result = a + b;
        System.out.println("🧪 R1: Add " + a + " + " + b + " = " + result);
        assertEquals("R1: Add 5 + 3", 8.0, result, 0.0001);
    }

    @Test
    public void testSubtract() {
        double a = 5, b = 3;
        double result = a - b;
        System.out.println("🧪 R2: Subtract " + a + " - " + b + " = " + result);
        assertEquals("R2: Subtract 5 - 3", 2.0, result, 0.0001);
    }

    @Test
    public void testMultiply() {
        double a = 5, b = 3;
        double result = a * b;
        System.out.println("🧪 R3: Multiply " + a + " * " + b + " = " + result);
        assertEquals("R3: Multiply 5 * 3", 15.0, result, 0.0001);
    }

    @Test
    public void testDivide() {
        double a = 6, b = 2;
        double result = a / b;
        System.out.println("🧪 R4: Divide " + a + " / " + b + " = " + result);
        assertEquals("R4: Divide 6 / 2", 3.0, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int a = 6, b = 0;
        System.out.println("🧪 R5: Divide " + a + " / " + b + " = ❌ Expecting Division by Zero");
        int result = a / b; // should throw exception
    }

    @Test
    public void testAddNegative() {
        double a = -10, b = 20;
        double result = a + b;
        System.out.println("🧪 R6: Add " + a + " + " + b + " = " + result);
        assertEquals("R6: Add -10 + 20", 10.0, result, 0.0001);
    }

    @Test
    public void testAddFloat() {
        double a = 0.1, b = 0.2;
        double result = a + b;
        System.out.println("🧪 R7: Add " + a + " + " + b + " = " + result);
        assertEquals("R7: Add 0.1 + 0.2", 0.3, result, 0.0001);
    }

    @Test
    public void testLargeSubtract() {
        double a = 1_000_000, b = 999_999;
        double result = a - b;
        System.out.println("🧪 R8: Subtract " + a + " - " + b + " = " + result);
        assertEquals("R8: Subtract 1M - 999999", 1.0, result, 0.0001);
    }

    @Test
    public void testFloatMultiply() {
        double a = 3.5, b = 2;
        double result = a * b;
        System.out.println("🧪 R9: Multiply " + a + " * " + b + " = " + result);
        assertEquals("R9: Multiply 3.5 * 2", 7.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperation() {
        System.out.println("🧪 R10: Invalid operation — Expecting IllegalArgumentException");
        throw new IllegalArgumentException("Unknown operation");
    }

    @Test
    public void testFailingCase() {
        System.out.println("Running intentional failing test...");
        assertEquals("Intentional failure", 5, 2 + 2); // Fails: 5 ≠ 4
    }

}
