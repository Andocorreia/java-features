package br.com.releases.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

// Explicação
// A Method Reference (referência a metodo) é um recurso do Java 8 que
// permite referenciar diretamente um metodo existente sem precisar
// escrever uma expressão lambda completa. É uma forma ainda mais concisa
// e legível de passar comportamento como argumento.

public class MethodReference {

    private  static int compareByName(Person a, Person b)	{
        return a.getName().compareTo(b.getName());
    }
    private static int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public List<Person> staticMethodByName(List<Person> personList) {
        Collections.sort(personList, MethodReference::compareByName);

        System.out.println("Sort by Name :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
        System.out.println();

        return personList;
    }

    public List<Person> staticMethodByAge( List<Person> personList) {
        Collections.sort(personList, MethodReference::compareByAge);
        System.out.println("Sort by Age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        return personList;
    }

    public List<Person> instanceMethodByName( List<Person> personList) {
        ComparisonProvider comparator = new ComparisonProvider();

        Collections.sort(personList, comparator::compareByName);
        System.out.println("Sort by Name :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
        return personList;
    }

    public List<Person> instanceMethodByAge( List<Person> personList) {
        ComparisonProvider comparator = new ComparisonProvider();

        Collections.sort(personList, comparator::compareByAge);
        System.out.println("Sort by Age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        return personList;
    }

    public List<String> arbitraryMethodByName(List<String> personNameList) {
        Collections.sort(personNameList, String::compareToIgnoreCase);
        personNameList.forEach(System.out::println);
        System.out.println();

        return personNameList;
    }

    private  <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }

    public List<Person> constructorMethodByName( List<Person> personList ) {
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
        return personList;
    }
}

@Getter
@Setter
@AllArgsConstructor
class Person {
    private String name;
    private int age;

    public Person() {
        Random ran = new Random();
        this.name = ran.ints(97, 122 + 1)
                .limit(7).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}

class ComparisonProvider{
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
    public int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
