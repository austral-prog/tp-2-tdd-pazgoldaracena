package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {

        if (password == null) {
            return false;
        }

        boolean validLength = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        if (password.length() >= 8) {
            validLength = true;
        }
        for (char c : password.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                hasLower = true;
            } else if (c >= '0' && c <= '9') {
                hasDigit = true;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial && validLength) {
            return true;
        }

        return false;
    }
}