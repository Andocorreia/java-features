package br.com.releases.java14;

//Explanation
//Switch expressions, introduced in Java 12 and enhanced in Java 14,
//are a more concise and expressive form of the traditional switch statement.
//They allow the switch construct to be used as an expression, returning a value,
//and introduce a simplified syntax that eliminates the need for break
//statements to prevent fall-through.

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
