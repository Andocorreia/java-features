package br.com.treinamentos.diversos.releases.java8;

//Explanation
//Default methods in Java are methods within an interface that have a
// concrete implementation. They are declared using the default keyword.
// Introduced in Java 8, default methods provide a way to add new
// functionality to existing interfaces without breaking compatibility
// with classes that already implement those interfaces.


interface DefaultMethodInterface {

    // abstract method
    public void sumMethod(int x);

    // default method
    default void defaultMethod() {
        System.out.println("Default method (DefaultMethodInterface) Executed");
    }

    // static method
    static void staticMethod() {
        System.out.println("Static method Executed");
    }
}

interface DefaultMethodInterface2 {
    // default method
    default void defaultMethod() {
        System.out.println("Default method (DefaultMethodInterface2) Executed");
    }
}

public class DefaultMethod implements DefaultMethodInterface, DefaultMethodInterface2 {

    // use super keyword to call the show
    public void defaultMethod() {
        DefaultMethodInterface.super.defaultMethod();
        DefaultMethodInterface2.super.defaultMethod();
    }

    @Override
    public void sumMethod(int x) {
        this.defaultMethod();
        System.out.println("Class Method Executed:" + x );

        DefaultMethodInterface.staticMethod();
    }
}
