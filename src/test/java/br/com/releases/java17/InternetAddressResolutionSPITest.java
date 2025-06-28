package br.com.releases.java17;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;

import static org.junit.jupiter.api.Assertions.*;

class InternetAddressResolutionSPITest {
    @Test
    void handlesNullInputGracefully() {
        InternetAddressResolutionSPI resolver = new InternetAddressResolutionSPI();
        InetAddress result = resolver.resolveAddress();
        assertNotNull(result.getHostAddress());
    }
}