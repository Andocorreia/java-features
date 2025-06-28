package br.com.releases.java12;

import java.text.NumberFormat;
import java.util.Locale;

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
