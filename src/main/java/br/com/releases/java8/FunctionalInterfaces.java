package br.com.releases.java8;

// Explicação
// A anotação @FunctionalInterface em Java foi introduzida no Java 8
// e é usada para indicar que uma interface é funcional, ou seja,
// possui apenas um metodo abstrato. Isso permite que ela seja usada
// com expressões lambda e referências de metodo, facilitando
// a programação funcional.

import java.lang.FunctionalInterface;

@FunctionalInterface
interface Calculate {
    abstract int calc(int a, int b);
}

class FunctionalInterfaces {

    public void createdNewTread() {
        new Thread(() -> System.out.println("New Thread")).start();
    }

    public int sumValues(int a, int b) {
        Calculate calculate = (x, y) -> x + y;
        return calculate.calc(a, b);
    }

}

