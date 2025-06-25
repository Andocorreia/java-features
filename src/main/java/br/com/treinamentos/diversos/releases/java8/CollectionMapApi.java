package br.com.treinamentos.diversos.releases.java8;

import java.util.*;

// Explanation
// The Collection interface (java.util.Collection) and Map interface (java.util.Map)
// are the two main “root” interfaces of Java collection classes.
public class CollectionMapApi {

    public Collection<String> collection() {

        Collection<String> nomes = new ArrayList<>();
        nomes.add("Vanessa");
        nomes.add("André");
        nomes.add("Matheus");
        nomes.add("Vitoria");

        return nomes;
    }

    public Map<Integer, String> map() {
        Map<Integer, String> pessoas = new TreeMap<>();
        pessoas.put(1, "Vanessa");
        pessoas.put(2, "André");
        pessoas.put(3, "Matheus");
        pessoas.put(4, "Vitoria");

        return pessoas;
    }
}
