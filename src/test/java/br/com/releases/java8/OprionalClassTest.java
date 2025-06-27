package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class OprionalClassTest {

    @Test
    void returnNullOptionalShouldReturnEmptyOptional() {
        OptionalClass optionClass = new OptionalClass();
        Optional<String> result = optionClass.returnNullOptional();

        assertFalse(result.isPresent());
    }

    @Test
    void returnValueOptionalShouldReturnOptionalContainingProvidedValue() {
        OptionalClass optionalClass = new OptionalClass();
        Optional<String> result = optionalClass.returnValueOptional("testValue");

        assertEquals("testValue", result.get());
    }

    @Test
    void isPresentShouldReturnTrueWhenOptionalContainsValue() {
        OptionalClass optionalClass = new OptionalClass();
        Optional<String> optional = Optional.of("value");

        assertTrue(optionalClass.isPresent(optional));
    }

    @Test
    void isPresentShouldReturnFalseWhenOptionalIsEmpty() {
        OptionalClass optionalClass = new OptionalClass();
        Optional<String> optional = Optional.empty();

        assertFalse(optionalClass.isPresent(optional));
    }
}
