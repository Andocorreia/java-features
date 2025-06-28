package br.com.releases.java12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompactNumberFormattingTest {

    @Test
    void formatsNumberCorrectlyForSortedMillion() {
        CompactNumberFormatting formatter = new CompactNumberFormatting();
        String result = formatter.numbersSorted(1000000);
        assertEquals("1 mi", result);
    }

    @Test
    void formatsNumberCorrectlyForLongMillion() {
        CompactNumberFormatting formatter = new CompactNumberFormatting();
        String result = formatter.numbersLong(1000000);
        assertEquals("1 milhão", result);
    }
}
