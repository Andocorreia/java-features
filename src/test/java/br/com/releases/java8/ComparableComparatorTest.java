package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComparableComparatorTest {

    @Test
    void comparableShouldReturnFirstMovieAfterSortingByYear() {
        ComparableComparator comparableComparator = new ComparableComparator();
        Movie result = comparableComparator.comparable();

        assertNotNull(result);
        assertEquals("Star Wars", result.getName());
        assertEquals(1977, result.getYear());
    }

    @Test
    void comparatorShouldReturnFirstMovieAfterSortingByName() {
        ComparableComparator comparableComparator = new ComparableComparator();
        Movie result = comparableComparator.Comparator();

        assertNotNull(result);
        assertEquals("Empire Strikes Back", result.getName());
        assertEquals(1980, result.getYear());
    }
}
