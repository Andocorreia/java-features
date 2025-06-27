package br.com.releases.java8;

//Explanation
//Stream was introduced in Java 8, the Stream API is used to process collections of objects.
//A stream in Java is a sequence of objects that supports various methods that can be pipelined
//to produce the desired result.

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
