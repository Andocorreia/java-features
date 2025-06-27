package br.com.treinamentos.diversos.releases.java9;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrivateMethodsInterfacesTest {

    @Test
    void getDurationShouldReturnNonNullDuration() {
        PrivateMethodsInterfaces privateMethodsInterfaces = new PrivateMethodsInterfaces();
        Duration result = privateMethodsInterfaces.getDuration(LocalDateTime.now().minusHours(3));

        assertNotNull(result);
        assertTrue(result.toMinutes()==180);
    }
}
