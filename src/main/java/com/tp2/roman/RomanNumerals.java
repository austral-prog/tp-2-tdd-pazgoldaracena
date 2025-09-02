package com.tp2.roman;

public class RomanNumerals {

    public String convert(int number) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String roman = "";

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman += (symbols[i]);
            }
        }
        return roman;
    }
}

// TODO: Implement roman numeral conversion following TDD approach
// Start with basic numbers: 1=I, 5=V, 10=X
// Then handle subtraction cases: 4=IV, 9=IX
// Build up to complex numbers like 1994=MCMXCIV