package br.com.treinamentos.diversos.releases.java8;

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
