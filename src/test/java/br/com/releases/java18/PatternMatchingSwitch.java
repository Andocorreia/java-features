package br.com.releases.java18;

public class PatternMatchingSwitch {
    public String describeShape(Object shape) {
        return switch (shape) {
            case Circle c when c.radius() > 10 -> "Círculo grande";
            case Circle c -> "Círculo pequeno";
            case Rectangle r -> "Retângulo";
            default -> "Forma desconhecida";
        };
    }
}

sealed interface Shape permits Circle, Rectangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
