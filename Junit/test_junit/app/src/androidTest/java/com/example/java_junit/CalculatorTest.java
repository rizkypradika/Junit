package com.example.java_junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Kelas CalculatorTest merupakan kelas yang digunakan untuk menguji fungsionalitas
 * dari kelas Calculator menggunakan kerangka pengujian JUnit.
 */
public class CalculatorTest {
    /**
     * Pengujian fungsi penambahan (add) pada kelas Calculator.
     */
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    /**
     * Pengujian fungsi pengurangan (subtract) pada kelas Calculator.
     */
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result);
    }

    /**
     * Pengujian fungsi perkalian (multiply) pada kelas Calculator.
     */
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 6);
        assertEquals(12, result);
    }

    /**
     * Pengujian fungsi pembagian (divide) pada kelas Calculator.
     */
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    /**
     * Pengujian pembagian dengan angka nol (divide by zero) pada kelas Calculator.
     * Memastikan bahwa IllegalArgumentException dilempar saat mencoba membagi dengan nol.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}
