package br.com.treinamentos.diversos.releases.java14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionTest {

    private final SwitchExpression dayType = new SwitchExpression();

    @Test
    void testWeekendDays() {
        assertEquals("Weekend", dayType.getDayType(1)); // Domingo
        assertEquals("Weekend", dayType.getDayType(7)); // Sábado
    }

    @Test
    void testWeekdayDays() {
        assertEquals("Weekday", dayType.getDayType(2)); // Segunda
        assertEquals("Weekday", dayType.getDayType(3)); // Terça
        assertEquals("Weekday", dayType.getDayType(4)); // Quarta
        assertEquals("Weekday", dayType.getDayType(5)); // Quinta
        assertEquals("Weekday", dayType.getDayType(6)); // Sexta
    }

    @Test
    void testInvalidDay() {
        assertThrows(IllegalArgumentException.class, () -> dayType.getDayType(0)); // Dia inválido
        assertThrows(IllegalArgumentException.class, () -> dayType.getDayType(8)); // Dia inválido
        assertThrows(IllegalArgumentException.class, () -> dayType.getDayType(-1)); // Dia inválido
    }

}