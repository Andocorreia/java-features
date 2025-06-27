package br.com.releases.java9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ReactiveStreamsAPITest {

    @Test
    void processesAllItemsInListSuccessfully() {
        ReactiveStreamsAPI api = new ReactiveStreamsAPI();
        assertDoesNotThrow(api::async);
    }
}
