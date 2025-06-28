package br.com.releases.java8;

// Explicação
// Interfaces podem conter métodos abstratos, métodos default e métodos estáticos.
// Métodos default são métodos que têm uma implementação padrão e podem ser
// sobrescritos pelas classes que implementam a interface.
// Métodos estáticos são métodos que pertencem à interface e podem ser chamados
// sem uma instância da interface.

interface DefaultMethodInterface {

    public void sumMethod(int x);

    default void defaultMethod() {
        System.out.println("Default method (DefaultMethodInterface) Executed");
    }

    static void staticMethod() {
        System.out.println("Static method Executed");
    }
}

interface DefaultMethodInterface2 {
    default void defaultMethod() {
        System.out.println("Default method (DefaultMethodInterface2) Executed");
    }
}

public class DefaultMethod implements DefaultMethodInterface, DefaultMethodInterface2 {

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
