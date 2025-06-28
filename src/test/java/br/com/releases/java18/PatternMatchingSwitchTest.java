package br.com.releases.java18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternMatchingSwitchTest {
    @Test
    void returnsRectangleDescriptionForRectangleShape() {
        PatternMatchingSwitch instance = new PatternMatchingSwitch();
        String result = instance.describeShape(new Rectangle(5, 10));
        assertEquals("Retângulo", result);
    }
}
