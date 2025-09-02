package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    RomanNumerals num = new RomanNumerals();

    @Test
    void convertOneTest() {
        assertEquals("I", num.convert(1));
    }

    @Test
    void convertFiveTest() {
        assertEquals("V", num.convert(5));
    }

    @Test
    void convertTenTest() {
        assertEquals("X", num.convert(10));
    }

    @Test
    void convertFourTest() {
        assertEquals("IV", num.convert(4));
    }

    @Test
    void convertNineTest() {
        assertEquals("IX", num.convert(9));
    }

    @Test
    void convertFortyTest() {
        assertEquals("XL", num.convert(40));
    }

    @Test
    void convertFiftyTest() {
        assertEquals("L", num.convert(50));
    }

    @Test
    void convertNinetyTest() {
        assertEquals("XC", num.convert(90));
    }

    @Test
    void convertHundredsTest() {
        assertEquals("C", num.convert(100));
    }

    @Test
    void convertFourHundredTest() {
        assertEquals("CD", num.convert(400));
    }

    @Test
    void convertFiveHundredTest() {
        assertEquals("D", num.convert(500));
    }

    @Test
    void convertNineHundredTest() {
        assertEquals("CM", num.convert(900));
    }

    @Test
    void convertThousandTest() {
        assertEquals("M", num.convert(1000));
    }

    @Test
    void convertComplexTest() {
        assertEquals("MCMXCIV", num.convert(1994));
        assertEquals("CMXXIX", num.convert(929));
        assertEquals("DLXII", num.convert(562));
        assertEquals("MMMCDXCII", num.convert(3492));
    }

//    Missing tests:
//
//- Convert 1 to "I"
//- Convert 5 to "V"
//- Convert 10 to "X"
//- Convert 4 to "IV" (subtraction case)
//- Convert 9 to "IX" (subtraction case)
//- Convert 40 to "XL"
//- Convert 50 to "L"
//- Convert 90 to "XC"
//- Convert 100 to "C"
//- Convert 400 to "CD"
//- Convert 500 to "D"
//- Convert 900 to "CM"
//- Convert 1000 to "M"
//- Convert complex numbers like 1994 to "MCMXCIV"
}
