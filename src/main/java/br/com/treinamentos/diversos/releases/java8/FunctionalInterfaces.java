package br.com.treinamentos.diversos.releases.java8;

//Explanation
//A functional interface in Java is an interface that contains only one
//abstract method. Functional interfaces can have multiple default or static
//methods, but only one abstract method. Runnable, ActionListener, and
//Comparator are common examples of Java functional interfaces.

import java.lang.FunctionalInterface;

@FunctionalInterface
interface Calculate {
    abstract int calc(int a, int b);
}

class FunctionalInterfaces {

    public void createdNewTread() {
        //to implement Runnable
        new Thread(() -> System.out.println("New Thread")).start();
    }

    public int sumValues(int a, int b) {
        Calculate calculate = (x, y) -> x + y;
        return calculate.calc(a, b);
    }

}

