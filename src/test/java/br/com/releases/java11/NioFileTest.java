package br.com.releases.java11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NioFileTest {

    @Test
    void writesAndReadsTextSuccessfully() throws Exception {
        NioFile nioFiles = new NioFile();
        String result = nioFiles.ioFiles("Hello, world!");
        assertEquals("Hello, world!", result);
    }
}
