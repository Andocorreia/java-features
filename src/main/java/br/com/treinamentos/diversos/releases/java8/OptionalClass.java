package br.com.treinamentos.diversos.releases.java8;

import java.util.Optional;

//Explanation
//Optional was introduced in Java 8 to represent a value that may or may not be present.
// It is a container object which may or may not contain a non-null value.
// It is used to avoid null checks and NullPointerExceptions in Java code.
// The Optional class provides methods to check if a value is present, retrieve the value,
// and perform operations on the value if it is present.
// The Optional class is part of the java.util package and is often used in functional programming
// paradigms to handle optional values in a more elegant way.

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
