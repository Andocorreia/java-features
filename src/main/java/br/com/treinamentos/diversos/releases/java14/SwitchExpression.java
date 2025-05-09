package br.com.treinamentos.diversos.releases.java14;

public class SwitchExpression {

    public String getDayType(int day) {
        return switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
    }
}
