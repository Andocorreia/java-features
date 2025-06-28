package br.com.releases.java14;

//Explicação
// O Switch Expression foi introduzido no Java 12 como uma prévia e se tornou uma feature oficial no Java 14.
// Ele permite que o switch seja usado como uma expressão, retornando um valor diretamente,
// além de suportar múltiplos rótulos (case labels) em uma única linha.
// Isso torna o código mais conciso e legível, eliminando a necessidade de usar a palavra-chave break
// para evitar a queda de casos (fall-through).
// Além disso, o switch expression pode lidar com valores nulos de forma mais elegante,
// permitindo que você lance exceções ou retorne valores padrão diretamente dentro do switch.

public class SwitchExpression {

    public String getDayType(Integer day) {
        return switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            case null -> throw new IllegalArgumentException("Day cannot be null");
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
    }
}
