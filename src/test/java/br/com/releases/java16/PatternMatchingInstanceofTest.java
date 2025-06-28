package br.com.releases.java16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingInstanceofTest {

    @Test
    void returnsStringWhenObjectIsString() {
        PatternMatchingInstanceof instance = new PatternMatchingInstanceof();
        String result = instance.print("Hello");
        assertEquals("STRING", result);
    }
}
