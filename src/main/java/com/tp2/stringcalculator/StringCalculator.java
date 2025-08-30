package com.tp2.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    
    public int add(String numbers) {
        int sum = 0;
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        else if (numbers.length() > 1) {

            for (char i: numbers.toCharArray()) {

                String num = String.valueOf(i);

                if (!num.equals(",") && !num.equals("\n") && !num.equals(" ")) {
                    int n = Integer.parseInt(num);
                    if (n < 0) {
                        throw new IllegalArgumentException("Negative numbers are not allowed!");
                    } else {
                        sum += n;
                    }
                }
            }
        }
        return sum;
    }
}