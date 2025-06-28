package br.com.releases.java16;

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
