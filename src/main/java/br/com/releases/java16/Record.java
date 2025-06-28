package br.com.releases.java16;

// Explicação
// A funcionalidade de record foi introduzida como recurso permanente no Java 16
// (após ter sido prévia em Java 14 e 15). Ela permite declarar classes imutáveis
// de forma concisa, ideais para representar "data carriers" — objetos que apenas
// armazenam dados.
// Os records automaticamente geram métodos como equals(), hashCode() e toString(),
// além de fornecer acesso aos campos através de métodos getters com o mesmo nome dos campos.

// Vantagens
// Menos código boilerplate
// Imutabilidade garantida
// Ideal para DTOs, respostas de APIs, registros de log, etc.
// Melhor integração com frameworks modernos (ex: Spring, Jackson)

public class Record {
    public String name(String nome, String email) {
        Usuario user = new Usuario(nome, email);
        System.out.println("Nome: " + user.nome() + ", Email: " + user.email());
        return user.nome();
    }
}

record Usuario(String nome, String email) {
    public Usuario {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}

