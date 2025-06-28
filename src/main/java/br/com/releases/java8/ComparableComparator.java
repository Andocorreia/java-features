package br.com.releases.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Explicação
// As interfaces Comparable e Comparator em Java são usadas para definir regras
// de ordenação de objetos. Elas são fundamentais quando você precisa ordenar
// coleções de objetos personalizados, como listas de produtos, alunos, ou
// qualquer outra classe que você crie.

// Diferenças principais
// | Característica	        | Comparable	                | Comparator                            |
// | Onde é implementado	| Na própria classe	            | Fora da classe                        |
// | Número de ordenações	| Uma (ordem natural)           | Múltiplas (flexível)                  |
// | Metodo principal	    | compareTo(T o)	            | compare(T o1, T o2)                   |
// | Java 8 suporte	        | Não usa lambdas diretamente	| Usa lambdas e métodos utilitários     |

public class ComparableComparator {

    public Movie comparable() {
        // Criando uma lista de Filmes
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Ordenando a lista de filmes utilizando o CompareTo
        Collections.sort(l);

        // Imprimindo os filmes ordenados
        System.out.println("Movies after sorting by year:");
        l.stream().forEach(a -> System.out.println(a.getName() + " (" + a.getYear() + ") - Rating: " + a.getRating()));

        return l.getFirst();
    }

    public Movie Comparator() {
        // Criando uma lista de Filmes
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.7, 1977));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));

        // Ordenando a lista de filmes por Rating utilizando o Comparator
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        m.stream().forEach(a -> System.out.println(a.getRating() + " " + a.getName() + " (" + a.getYear() + ")"));

        // Ordenando a lista de filmes por Nome utilizando o Comparator
        Collections.sort(m, new NameCompare());
        System.out.println("Movies sorted by name:");
        m.stream().forEach(a -> System.out.println(a.getRating() + " " + a.getName() + " (" + a.getYear() + ")"));

        return m.getFirst();
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Implementando o CompareTo default para permitir a ordenação por ano
    public int compareTo(Movie m) {
        return this.year - m.year;
    }
}

// Comparator por Rating
class Rating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating());
    }
}

// Comparator por nome do filme
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
