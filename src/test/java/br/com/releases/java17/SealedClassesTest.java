package br.com.releases.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SealedClassesTest {
    @Test
    void calculatesTotalAreaForValidInputs() {
        SealedClasses sealedClasses = new SealedClasses();
        double result = sealedClasses.calc(3, 4, 5);
        assertEquals(28.274333882308138 + 20.0, result);
    }

}