package br.com.treinamentos.diversos.releases.java8;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CollectionMapApiTest {

    @Test
    void collectionShouldReturnNonEmptyListOfNames() {
        CollectionMapApi api = new CollectionMapApi();
        Collection<String> result = api.collection();

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals(true, result.contains("Vanessa"));
        assertEquals(true, result.contains("André"));
        assertEquals(true, result.contains("Matheus"));
        assertEquals(true, result.contains("Vitoria"));
    }

    @Test
    void mapShouldReturnNonEmptyMapWithCorrectKeyValuePairs() {
        CollectionMapApi api = new CollectionMapApi();
        Map<Integer, String> result = api.map();

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals("Vanessa", result.get(1));
        assertEquals("André", result.get(2));
        assertEquals("Matheus", result.get(3));
        assertEquals("Vitoria", result.get(4));
    }
}
