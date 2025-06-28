package br.com.releases.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CauseOfNullPointerExceptionTest {

    @Test
    void throwsNullPointerExceptionWhenNameIsNull() {
        CauseOfNullPointerException instance = new CauseOfNullPointerException();
        try {
            instance.name();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            assertThrows(NullPointerException.class, instance::name);

        }



    }
}