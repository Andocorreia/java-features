package br.com.releases.java21;

//Explicação
// Permite usar padrões de tipo diretamente em instruções switch, com suporte a guardas (when).
// Torna o código mais expressivo e seguro.

public class PatternMatchingSwitch {
    public void printTypeInfo(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("É um inteiro: " + i);
            case String s -> System.out.println("É uma string: " + s);
            case Double d when d > 0 -> System.out.println("É um double positivo: " + d);
            case null -> System.out.println("É nulo");
            default -> System.out.println("Tipo desconhecido: " + obj);
        }
    }
}
