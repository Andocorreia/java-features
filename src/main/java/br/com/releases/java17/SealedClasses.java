package br.com.releases.java17;

// Explicação
// As classes seladas (sealed classes) permitem que você controle quais classes podem
// estender ou implementar uma classe ou interface específica.
// Elas foram introduzidas no Java 17 e são úteis para criar hierarquias de classes mais
// seguras e previsíveis.

class SealedClasses {

    public double calc(int radius, int width, int height) {
        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(width, height);

        System.out.println("Área do círculo: " + circle.area());
        System.out.println("Área do retângulo: " + rectangle.area());
        return circle.area() + rectangle.area();
    }
}

sealed interface Shape permits Circle, Rectangle {
    double area();
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}


