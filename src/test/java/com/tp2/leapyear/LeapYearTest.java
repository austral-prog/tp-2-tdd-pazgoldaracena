package com.tp2.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void isDivisibleByFourTest() {
        LeapYear year = new LeapYear();
        assertTrue(year.isLeapYear(2004));
    }

    @Test
    public void isNotDivisibleBy100Test() {
        LeapYear year = new LeapYear();
        assertFalse(year.isLeapYear(1550));
    }

    @Test
    public void isDivisibleBy400Test() {
        LeapYear year = new LeapYear();
        assertTrue(year.isLeapYear(1200));
    }

//    Missing tests:
//
//- A year is a leap year if it is divisible by 4
//- A year is not a leap year if it is divisible by 100
//- A year is a leap year if it is divisible by 400
}
