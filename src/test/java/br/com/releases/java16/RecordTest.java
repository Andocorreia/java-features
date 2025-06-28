package br.com.releases.java16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    @Test
    void returnsUsuarioNameWhenEmailContainsSpecialCharacters() {
        Record record = new Record();
        String result = record.name("Maria", "maria+test@example.com");
        assertEquals("Maria", result);
    }
}
