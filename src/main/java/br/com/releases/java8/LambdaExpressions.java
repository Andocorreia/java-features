package br.com.releases.java8;

//Explanation
//Lambda expressions in Java, introduced in Java SE 8. It represents the instances of
//functional interfaces (interfaces with a single abstract method). They provide a
//concise way to express instances of single-method interfaces using a block of code.

import java.lang.FunctionalInterface;
import java.util.ArrayList;

@FunctionalInterface
interface LambdaInterface {
    int abstractFunc(int x);

    default void normalFun(){
        System.out.println("Normal function");
    }
}

public class LambdaExpressions {

    public int multiplicateForFive (int x) {
        LambdaInterface lambdaInterface = (int y) -> y * 5;

        return lambdaInterface.abstractFunc(x);
    }
    public void isValue(int x) {
        ArrayList<Integer> value = new ArrayList<>();
        value.add(1);
        value.add(2);
        value.add(3);
        value.add(4);

        value.forEach(y -> {
            if (x == y) {
                System.out.print("Value found");
            }
        });
    }
}
