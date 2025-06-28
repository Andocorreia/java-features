package br.com.releases.java8;

// Explicação
// As expressões lambda foram introduzidas no Java 8 como uma forma concisa
// de representar funções anônimas — ou seja, blocos de código que podem ser
// passados como argumentos para métodos ou armazenados em variáveis.

// Vantagens
// Código mais limpo e legível
// Facilita programação funcional
// Integração com Streams e APIs modernas
// Evita criação de classes anônimas verbosas

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
