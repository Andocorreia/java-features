package br.com.releases.java9;

import org.junit.jupiter.api.Test;

import java.awt.Image;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class MultiResolutionImageAPITest {

    @Test
    void shouldListAllAvailableResolutions64() throws IOException {
        int destinationWidth = 50;
        int destinationHeigh = 50;

        MultiResolutionImageAPI api = new MultiResolutionImageAPI();
        Image result = api.imagem(destinationWidth, destinationHeigh);

        assertNotNull(result);
        assertEquals(result.getWidth(null),64);
        assertEquals(result.getHeight(null),64);

    }

    @Test
    void shouldListAllAvailableResolutions128() throws IOException {
        int destinationWidth = 1024;
        int destinationHeigh = 2048;

        MultiResolutionImageAPI api = new MultiResolutionImageAPI();
        Image result = api.imagem(destinationWidth, destinationHeigh);

        assertNotNull(result);
        assertEquals(result.getWidth(null),128);
        assertEquals(result.getHeight(null),128);

    }
}
