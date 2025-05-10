package br.com.treinamentos.diversos.releases.java13;

//Explanation
//Text Blocks, introduced in Java 13 and enhanced in Java 15, are a form of string literal that simplifies
//the handling of multi-line strings. They are defined by triple quotes """ and
//allow strings to span multiple lines without the need for explicit newline
//characters or concatenation. Text Blocks enhance code readability and reduce
//the verbosity associated with traditional multi-line strings.

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
