package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfacesTest {

    @Test
    void createdNewTread() {
        FunctionalInterfaces functionalInterfaces = new FunctionalInterfaces();

        functionalInterfaces.createdNewTread();


        System.setOut(System.out); // Reset System.out
    }

    @Test
    void sumValuesReturnsCorrectSumForPositiveNumbers() {
        FunctionalInterfaces functionalInterfaces = new FunctionalInterfaces();
        assertEquals(7, functionalInterfaces.sumValues(3, 4));
    }
}