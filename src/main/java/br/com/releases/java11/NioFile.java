package br.com.releases.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Explicação
// O NIO (New Input/Output) é uma API introduzida no Java que oferece
// uma maneira mais eficiente e flexível de manipular arquivos e diretórios.
// Ele permite operações assíncronas, manipulação de buffers e suporte a canais,
// tornando-o mais adequado para aplicações que exigem alta performance e
// escalabilidade. O NIO também introduz o conceito de Path, que representa
// caminhos de arquivos de forma mais robusta e independente do sistema operacional.

public class NioFile {

    public String ioFiles(String text) throws Exception {
        String fileName = "src/main/resources/exemplo.txt";
        Path path = Paths.get(fileName);
        Files.writeString(path, text);

        String conteudo = Files.readString(path);
        System.out.println(conteudo);

        Files.delete(path);
        return conteudo;
    }
}
