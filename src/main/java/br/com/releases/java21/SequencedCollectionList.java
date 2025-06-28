package br.com.releases.java21;

//Explicação
// A classe SequencedCollection permite armazenar elementos em uma coleção sequencial
// e acessar o primeiro e o último elemento de forma eficiente. Ela é útil quando a
// ordem dos elementos é importante, como em listas ou filas, e oferece métodos para
// adicionar, remover e acessar elementos de forma sequencial. A implementação é
// baseada na interface SequencedCollection do Java 21.

import java.util.SequencedCollection;
import java.util.ArrayList;

public class SequencedCollectionList {
    public void run(String[] args) {
        SequencedCollection<String> nomes = new ArrayList<>();
        nomes.addFirst("Ana");
        nomes.addLast("Carlos");
        nomes.addLast("Beatriz");

        System.out.println("Primeiro: " + nomes.getFirst()); // Ana
        System.out.println("Último: " + nomes.getLast());   // Beatriz

        System.out.println("Todos os nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.removeFirst(); // Remove "Ana"
        nomes.removeLast();  // Remove "Beatriz"

        System.out.println("Após remoções: " + nomes);
    }
}
