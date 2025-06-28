package br.com.releases.java8;

import java.util.Optional;

// Explicação
// A classe Optional<T> foi introduzida no Java 8 como uma forma elegante
// de lidar com valores que podem ou não estar presentes, evitando o uso
// excessivo de null e prevenindo o temido NullPointerException.

// Vantagens
// Evita null diretamente no código.
// Força o tratamento explícito de valores ausentes.
// Melhora a legibilidade e segurança do código.
// Facilita integração com Streams e lambdas.

public class OptionalClass {

    public Optional<String> returnNullOptional() {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        return empty;
    }

    public Optional<String> returnValueOptional(String str) {
        Optional<String> value = Optional.of(str);
        System.out.println(value);
        return value;
    }

    public Boolean isPresent(Optional<String> optional) {
        boolean present = optional.isPresent();
        System.out.println(present);
        return present;
    }
}
