package br.com.releases.java13;

// Explicação
// O recurso de Text Blocks foi introduzido no Java 13 como uma prévia
// do recurso completo que seria lançado no Java 14.
// Ele permite que strings multilinha sejam definidas de forma mais legível,
// sem a necessidade de concatenar várias linhas ou usar caracteres de escape.
// Isso facilita a escrita de strings que contêm texto formatado, como HTML, JSON ou SQL.

public class TextBlocks {
    public String textBlock() {
        String text = """
        Em um lugar distante, onde as montanhas tocam o céu,
        havia um pequeno vilarejo cercado por florestas densas.
        Os habitantes, conhecidos por sua hospitalidade,
        viviam em harmonia com a natureza, respeitando
        as tradições que foram passadas de geração em geração.
        
        Certa manhã, um viajante chegou ao vilarejo,
        trazendo histórias de terras longínquas e culturas
        exóticas. As crianças se reuniram ao seu redor,
        fascinadas por suas palavras e pela magia que
        emanava de suas experiências.
        
        O viajante falou sobre estrelas que dançam à noite,
        rios que cantam e montanhas que sussurram segredos.
        Aos poucos, os habitantes perceberam que,
        embora a vida no vilarejo fosse simples,
        a verdadeira riqueza estava nas histórias que
        eles compartilhavam e nas memórias que criavam juntos.""";

        System.out.println(text);
        return text;
    }
}
