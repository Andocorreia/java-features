package br.com.releases.java16;

//Explanation
// A record in Java is a special kind of class that is used to model immutable data.
// It is a concise way to create data-carrying classes without having to write boilerplate code.

import lombok.Getter;

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

