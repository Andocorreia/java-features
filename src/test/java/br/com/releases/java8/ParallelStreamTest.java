package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ParallelStreamTest {

    @Test
    void runShouldExecuteWithoutExceptionsForLargeNumber() {
        ParallelStream parallelStream = new ParallelStream();
        assertDoesNotThrow(() -> parallelStream.run());
    }
}
