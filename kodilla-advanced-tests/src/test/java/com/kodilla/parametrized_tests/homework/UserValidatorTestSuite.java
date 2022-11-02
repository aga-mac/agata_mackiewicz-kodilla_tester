package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"AgATAa", "1390", "A_G-", "-._.-"})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"ma", "euhr+_.", "nick92&", "Ag"})
    public void shouldReturnFalseIfUsernameIsWrong(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUsermailIsNullOrEmpty(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"aga_mac@gmail.com", "kasia.nowak@wp.pl", "A_9mack@gmail.com", "Gb5_h@interia.pl"})
    public void shouldReturnTrueIfUsermailIsCorrect(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"Aga*Mac.Kie$@wp.pl", "asdf.gmail.com.pl", "kasia.nowak@@interia.pl", ",#macki$_@yahoo.com"})
    public void shouldReturnFalseIfUsermailIsWrong(String email) {
        assertFalse(userValidator.validateEmail(email));
    }
}
