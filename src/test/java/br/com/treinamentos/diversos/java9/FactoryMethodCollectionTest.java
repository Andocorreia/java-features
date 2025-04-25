package br.com.treinamentos.diversos.java9;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodCollectionTest {

    private final FactoryMethodCollection factory = new FactoryMethodCollection();

    @Test
    void fromListReturnsUnmodifiableList() {
        List<String> result = factory.fromList();
        assertEquals(Arrays.asList("Vanessa", "Vitoria"), result);
        assertThrows(UnsupportedOperationException.class, () -> result.add("New Name"));
    }

    @Test
    void toListReturnsImmutableList() {
        List<String> result = factory.toList();
        assertEquals(Arrays.asList("Marcia", "Giselle"), result);
        assertThrows(UnsupportedOperationException.class, () -> result.add("New Name"));
    }

    @Test
    void fromSetReturnsUnmodifiableSet() {
        Set<String> result = factory.fromSet();
        assertEquals(new HashSet<>(Arrays.asList("Fabio", "Grimaldo", "Rita")), result);
        assertThrows(UnsupportedOperationException.class, () -> result.add("New Name"));
    }

    @Test
    void toSetReturnsImmutableSet() {
        Set<String> result = factory.toSet();
        assertEquals(Set.of("Alan", "Nubia"), result);
        assertThrows(UnsupportedOperationException.class, () -> result.add("New Name"));
    }

    @Test
    void toMapReturnsUnmodifiableMap() {
        Map<String, String> result = factory.toMap();
        assertEquals(Map.of("Cunhada", "Nubia", "Sogro", "Bento","Sogra", "Adelaide"), result);
        assertThrows(UnsupportedOperationException.class, () -> result.put("New Key", "New Value"));
    }

    @Test
    void fromMapReturnsImmutableMap() {
        Map<String, String> result = factory.fromMap();
        assertEquals(Map.of("Pai", "Grimaldo", "Mãe", "Rita"), result);
        assertThrows(UnsupportedOperationException.class, () -> result.put("New Key", "New Value"));
    }
}
