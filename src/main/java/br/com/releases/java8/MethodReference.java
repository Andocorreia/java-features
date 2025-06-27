package br.com.releases.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Explanation
//Method references were introduced in Java 8 as a shorthand notation of a lambda expression to call a method.
// They provide a way to refer to methods without executing them.
// Method references can be used to refer to:
// 1. A static method
// 2. An instance method of a particular object
// 3. An instance method of an arbitrary object of a particular type
// 4. A constructor
// Method references are often used in conjunction with functional interfaces, such as those defined in the java.util.function package.
// They can make the code more concise and readable by eliminating the need for boilerplate code in lambda expressions.


public class MethodReference {

    private  static int compareByName(Person a, Person b)	{
        return a.getName().compareTo(b.getName());
    }

    private static int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    ///////////////////////// Reference to a Static Method /////////////////////////
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
    ///////////////////////// Reference to a Static Method /////////////////////////

    ////////////////////// Reference to an Instance Method of a Particular Object //////////////////////
    public List<Person> instanceMethodByName( List<Person> personList) {
        ComparisonProvider comparator
                = new ComparisonProvider();

        Collections.sort(personList, comparator::compareByName);

        System.out.println("Sort by Name :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        return personList;
    }

    public List<Person> instanceMethodByAge( List<Person> personList) {
        ComparisonProvider comparator
                = new ComparisonProvider();

        Collections.sort(personList, comparator::compareByAge);

        System.out.println("Sort by Age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        return personList;
    }
    ////////////////////// Reference to an Instance Method of a Particular Object //////////////////////

    /////////////////////// Reference to an Instance Method of an Arbitrary Object of a Particular Type //////////////////////
    public List<String> arbitraryMethodByName(List<String> personNameList) {

        Collections.sort(personNameList, String::compareToIgnoreCase);

        personNameList.forEach(System.out::println);

        System.out.println();

        return personNameList;
    }
    /////////////////////// Reference to an Instance Method of an Arbitrary Object of a Particular Type //////////////////////

    ///////////////////////// Constructor Method Reference /////////////////////////
    private  <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }

    public List<Person> constructorMethodByName( List<Person> personList ) {
                // Print names of personList
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        return personList;
    }

    ///////////////////////// Constructor Method Reference /////////////////////////
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        Random ran = new Random();

        this.name
                = ran
                .ints(97, 122 + 1)
                .limit(7)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class ComparisonProvider
{
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
