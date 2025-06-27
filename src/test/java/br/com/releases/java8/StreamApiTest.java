package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamApiTest {

    @Test
    void mapStream() {
        List<String> expectedOutput = Arrays.asList("FUSCA", "GOL", "BRASILIA", "CRONOS");

        List<String> lista = Arrays.asList("Fusca", "gOl", "BRasilia", "cronoS");

        List<String> response = new StreamApi().mapStream(lista);

        assertEquals(expectedOutput, response);
    }

    @Test
    void filterStream() {
        List<String> expectedOutput = Arrays.asList("Fusca");

        List<String> lista = Arrays.asList("Fusca", "Gol", "Brasilia", "Cronos");

        List<String> response = new StreamApi().filterStream(lista);

        assertEquals(expectedOutput, response);
    }

    @Test
    void sortedStream() {
        List<String> expectedOutput = Arrays.asList("Brasilia", "Cronos", "Fusca", "Gol");

        List<String> lista = Arrays.asList("Fusca", "Gol", "Brasilia", "Cronos");

        List<String> response = new StreamApi().sortedStream(lista);

        assertEquals(expectedOutput, response);
    }

    @Test
    void flatMapStream() {
        List<String> expectedOutput = Arrays.asList(
                "Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting", "Mapping", "Reduction", "Stream");

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        List<String> response = new StreamApi().flatMapStream(listOfLists);

        assertEquals(expectedOutput, response);
    }

    @Test
    void distinctStream() {
        List<String> expectedOutput = Arrays.asList("Brasilia", "Cronos", "Fusca", "Gol");

        List<String> lista = Arrays.asList("Fusca", "Fusca", "Gol", "Gol", "Brasilia", "Brasilia", "Cronos");

        List<String> response = new StreamApi().distinctStream(lista);

        assertEquals(expectedOutput, response);
    }


    @Test
    void peekStream() {
        List<String> lista = Arrays.asList("Fusca", "Fusca", "Gol", "Gol", "Brasilia", "Brasilia", "Cronos");

        List<String> response = new StreamApi().peekStream(lista);

        assertEquals(lista, response);
    }
}