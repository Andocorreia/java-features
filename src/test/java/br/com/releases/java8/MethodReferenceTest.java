package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodReferenceTest {


    @Test
    void staticMethodByNameShouldSortListAlphabetically() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        MethodReference methodReference = new MethodReference();
        List<Person> sortedList = methodReference.staticMethodByName(personList);

        assertEquals("Poonam", sortedList.get(0).getName());
        assertEquals("Sachin", sortedList.get(1).getName());
        assertEquals("Vicky", sortedList.get(2).getName());


    }

    @Test
    void staticMethodByAgeShouldSortListByAscendingAge() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        MethodReference methodReference = new MethodReference();
        List<Person> sortedList = methodReference.staticMethodByAge(personList);

        assertEquals("Sachin", sortedList.get(0).getName());
        assertEquals("Vicky", sortedList.get(1).getName());
        assertEquals("Poonam", sortedList.get(2).getName());
    }

    @Test
    void instanceMethodByNameShouldSortListAlphabetically() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        MethodReference methodReference = new MethodReference();
        List<Person> sortedList = methodReference.instanceMethodByName(personList);

        assertEquals("Poonam", sortedList.get(0).getName());
        assertEquals("Sachin", sortedList.get(1).getName());
        assertEquals("Vicky", sortedList.get(2).getName());
    }

    @Test
    void instanceMethodByAgeShouldSortListByAscendingAge() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        MethodReference methodReference = new MethodReference();
        List<Person> sortedList = methodReference.instanceMethodByAge(personList);

        assertEquals("Sachin", sortedList.get(0).getName());
        assertEquals("Vicky", sortedList.get(1).getName());
        assertEquals("Poonam", sortedList.get(2).getName());
    }

    @Test
    void arbitraryMethodByNameShouldSortListAlphabeticallyIgnoringCase() {
        List<String> personNameList = new ArrayList<>();
        personNameList.add("Vicky");
        personNameList.add("poonam");
        personNameList.add("Sachin");

        MethodReference methodReference = new MethodReference();
        List<String> sortedList = methodReference.arbitraryMethodByName(personNameList);

        assertEquals("poonam", sortedList.get(0));
        assertEquals("Sachin", sortedList.get(1));
        assertEquals("Vicky", sortedList.get(2));
    }

    @Test
    void constructorMethodByNameShouldPrintAllNamesInList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        MethodReference methodReference = new MethodReference();
        List<Person> result = methodReference.constructorMethodByName(personList);

        assertEquals(3, result.size());
        assertEquals("Vicky", result.get(0).getName());
        assertEquals("Poonam", result.get(1).getName());
        assertEquals("Sachin", result.get(2).getName());
    }
}
