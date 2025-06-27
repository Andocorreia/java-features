package br.com.releases.java13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBlocksTest {

    @Test
    void textBlockFormatter() {
        String text = new TextBlocks().textBlock();

        assertEquals(mock(), text);

    }
    private String mock() {
        String text = "Em um lugar distante, onde as montanhas tocam o céu,\n" +
                "havia um pequeno vilarejo cercado por florestas densas.\n" +
                "Os habitantes, conhecidos por sua hospitalidade,\n" +
                "viviam em harmonia com a natureza, respeitando\n" +
                "as tradições que foram passadas de geração em geração.\n" +
                "\n" +
                "Certa manhã, um viajante chegou ao vilarejo,\n" +
                "trazendo histórias de terras longínquas e culturas\n" +
                "exóticas. As crianças se reuniram ao seu redor,\n" +
                "fascinadas por suas palavras e pela magia que\n" +
                "emanava de suas experiências.\n" +
                "\n" +
                "O viajante falou sobre estrelas que dançam à noite,\n" +
                "rios que cantam e montanhas que sussurram segredos.\n" +
                "Aos poucos, os habitantes perceberam que,\n" +
                "embora a vida no vilarejo fosse simples,\n" +
                "a verdadeira riqueza estava nas histórias que\n" +
                "eles compartilhavam e nas memórias que criavam juntos.";

        return text;
    }
}
