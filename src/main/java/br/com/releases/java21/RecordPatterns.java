package br.com.releases.java21;
// Explicação
// O Java 21 introduziu o recurso de "Record Patterns", que permite extrair componentes
// de registros diretamente em expressões `instanceof` e `switch`.

record Pessoa(String nome, int idade) {}

public class RecordPatterns {

    public void record() {
        Object obj = new Pessoa("Ana", 30);

        if (obj instanceof Pessoa(String nome, int idade)) {
            System.out.println("Nome: " + nome + ", Idade: " + idade);
        }

        switch (obj) {
            case Pessoa(String nome, int idade) -> System.out.println("Switch - Nome: " + nome + ", Idade: " + idade);
            default -> System.out.println("Outro tipo de objeto");
        }
    }
}
