package br.com.releases.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFile {

    public String ioFiles(String text) throws Exception {
        String fileName = "src/main/resources/exemplo.txt";
        Path path = Paths.get(fileName);

        // Writing
        Files.writeString(path, text);

        // reading
        String conteudo = Files.readString(path);
        System.out.println(conteudo);

        Files.delete(path);
        return conteudo;
    }
}
