package br.com.releases.java12;

import java.text.NumberFormat;
import java.util.Locale;

//Explicação
// A partir do Java 12, a classe NumberFormat foi aprimorada para incluir suporte
// a formatação de números compactos.
// Isso permite que números grandes sejam exibidos de forma mais legível,
// utilizando abreviações como "K" para milhares, "M" para milhões, "B" para bilhões, etc.

public class CompactNumberFormatting {
    public String numbersSorted(Integer number) {
        NumberFormat nf = NumberFormat.getCompactNumberInstance(
                new Locale("pt", "BR"), NumberFormat.Style.SHORT);

        String numberFormatted = nf.format(number);
        System.out.println("Formated Number:" + numberFormatted);
        return numberFormatted;
    }

    public String numbersLong(Integer number) {
        NumberFormat nf = NumberFormat.getCompactNumberInstance(
                new Locale("pt", "BR"), NumberFormat.Style.LONG);

        String numberFormatted = nf.format(number);
        System.out.println("Formated Number:" + numberFormatted);
        return numberFormatted;
    }
}
