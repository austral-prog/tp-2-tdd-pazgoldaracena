package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator result = new StringCalculator();

    @Test
    public void emptyStringTest() {
        assertEquals(0, result.add(""));
        assertNotEquals(0, result.add("7"));
    }

    @Test
    public void singleNumberStringTest() {
        assertEquals(7, result.add("7"));
    }

    @Test
    public void twoCommaSeparatedNumberStringTest() {
        assertEquals(6, result.add("4,2"));
        assertEquals(10, result.add("7,3"));
    }

    @Test
    public void multipleCommaSeparatedNumbersStringTest() {
        assertEquals(8, result.add("2,1,3,2"));
        assertEquals(4, result.add("1,2,1"));
    }

    @Test
    public void newlineSeparatedNumberStringTest() {
        assertEquals(13, result.add("3\n4,5,1"));
        assertEquals(9, result.add("3\n2\n4"));
    }

    @Test
    public void negativeNumberExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> result.add("3\n2\n-4"));
    }
}
