package br.com.releases.java16;

// Explicação
// O Pattern Matching para instanceof é um recurso introduzido no Java 16 que
// simplifica a verificação de tipos e o casting de objetos.
// Ele permite que você verifique se um objeto é de um tipo específico e, ao mesmo tempo,
// faça o casting desse objeto para esse tipo, tudo em uma única expressão.
// Isso reduz a necessidade de verificações de tipo separadas e elimina o risco de ClassCastException.

public class PatternMatchingInstanceof {

    public String print(Object obj) {
        if (obj instanceof String s) {
            System.out.println("É uma String com " + s.length() + " caracteres: " + s);
            return "STRING";
        } else if (obj instanceof Integer i) {
            System.out.println("É um Integer com valor: " + i);
            return "INTEGER";
        }
        System.out.println("Tipo desconhecido: " + obj);
        return "INVALIDO";

    }
}
