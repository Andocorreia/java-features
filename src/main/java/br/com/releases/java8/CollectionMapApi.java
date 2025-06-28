package br.com.releases.java8;

import java.util.*;

// Explicação
// As interfaces Collection e Map fazem parte da Java Collections Framework,
// que existe desde versões anteriores ao Java 8. No entanto, o Java 8 trouxe
// melhorias significativas para essas interfaces, especialmente com a introdução
// de métodos default e expressões lambda, que facilitaram a manipulação de
// coleções de forma mais funcional e concisa.

// A interface Collection é a raiz da hierarquia de coleções (como List, Set, Queue).
// Com o Java 8, ela passou a incluir métodos como:
// forEach(Consumer<? super T> action)
// removeIf(Predicate<? super T> filter)
// stream() e parallelStream()
// Ganhos:
// Código mais limpo e expressivo.
// Melhor desempenho com parallelStream.
// Redução de boilerplate (menos loops explícitos).

// A interface Map representa uma coleção de pares chave-valor. No Java 8, ela ganhou métodos como:
// forEach(BiConsumer<? super K, ? super V> action)
// getOrDefault(Object key, V defaultValue)
// putIfAbsent(K key, V value)
// compute, merge, replaceAll
// Ganhos:
// Manipulação mais segura e eficiente de mapas.
// Redução de código repetitivo.
// Facilita operações complexas como agregações e atualizações.

public class CollectionMapApi {

    public Collection<String> collection() {

        Collection<String> nomes = new ArrayList<>();
        nomes.add("Vanessa");
        nomes.add("André");
        nomes.add("Matheus");
        nomes.add("Vitoria");

        nomes.forEach(nome -> System.out.println("Nome: " + nome));

        return nomes;
    }

    public Map<Integer, String> map() {
        Map<Integer, String> pessoas = new TreeMap<>();
        pessoas.put(1, "Vanessa");
        pessoas.put(2, "André");
        pessoas.put(3, "Matheus");
        pessoas.put(4, "Vitoria");

        pessoas.forEach((id, nome) -> System.out.println("ID: " + id + ", Nome: " + nome));

        return pessoas;
    }
}
