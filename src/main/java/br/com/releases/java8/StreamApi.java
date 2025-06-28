package br.com.releases.java8;

// Explicação
// A Stream API foi introduzida no Java 8 e revolucionou a forma
// como manipulamos coleções de dados. Ela permite processar dados
// de forma declarativa e funcional, com foco em eficiência,
// legibilidade e paralelismo.

// Vantagens
// Código mais limpo e expressivo
// Facilidade para trabalhar com grandes volumes de dados
// Integração com lambdas e method references
// Suporte a processamento paralelo com parallelStream()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public List<String> mapStream(List<String> lista) {
        return lista.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public List<String> filterStream(List<String> lista) {
        return lista.stream().filter(s -> s.startsWith("F")).collect(Collectors.toList());
    }

    public List<String> sortedStream(List<String> lista) {
        return lista.stream().sorted().collect(Collectors.toList());
    }

    public List<String> flatMapStream(List<List<String>> lista) {
        return lista.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public List<String> distinctStream(List<String> lista) {
        return lista.stream().distinct().sorted().collect(Collectors.toList());
    }

    public List<String> peekStream(List<String> lista) {
        List<String> novaLista = new ArrayList<>();
        lista.stream().peek(novaLista::add).toList();
        return novaLista;
    }
}
