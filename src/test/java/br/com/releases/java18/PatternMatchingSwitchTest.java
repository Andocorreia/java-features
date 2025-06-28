package br.com.releases.java18;

// Explicação
// Pattern Matching para switch (JEP 420 - Preview) permite usar padrões mais expressivos
// e seguros em instruções switch, melhorando a legibilidade e reduzindo erros.

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
