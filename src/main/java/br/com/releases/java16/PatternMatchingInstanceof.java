package br.com.releases.java16;

//Explanation
// This code demonstrates the use of pattern matching with the instanceof operator in Java 16.
// It allows for more concise and readable type checks and casts in a single operation.
// Pattern matching with instanceof simplifies the code by eliminating the need for explicit casting
// after checking the type of an object. This feature enhances code clarity and reduces boilerplate code.
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
