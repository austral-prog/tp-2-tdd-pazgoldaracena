package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {
    PasswordValidator pass = new PasswordValidator();

    @Test
    public void isNotNull() {
        assertFalse(pass.isValid(null));
    }

    @Test
    void isLess8CharsTest() {
        assertFalse(pass.isValid("hello"));
    }

    @Test
    void isMore8CharsTest() {
        assertTrue(pass.isValid("helloworld"));
    }

    @Test
    void notHaveUpperCaseTest() {
        assertFalse(pass.isValid("helloworld"));
    }

    @Test
    void notHaveLowerCaseTest() {
        assertFalse(pass.isValid("HELLOWORLD"));
    }

    @Test
    void notHaveNumberTest() {
        assertFalse(pass.isValid("HelloWorld"));
    }

    @Test
    void notHaveSpecialCharTest() {
        assertFalse(pass.isValid("HelloWorld32"));
    }

    @Test
    void hasAllTest() {
        assertTrue(pass.isValid("Hello@World1"));
        assertFalse(pass.isValid("abc3!"));
}

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
