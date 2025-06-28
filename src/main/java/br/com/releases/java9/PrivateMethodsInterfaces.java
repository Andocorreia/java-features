package br.com.releases.java9;

// Explicação
// A partir do Java 9, é possível definir métodos privados em interfaces.

import java.time.Duration;
import java.time.LocalDateTime;

interface MyInterface {
    default Duration defaultMethod(LocalDateTime date) {
        return calculateDuration(date, privateMethod());
    }
    private LocalDateTime privateMethod() {
        return LocalDateTime.now();
    }
    private Duration calculateDuration(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start, end);
    }
}

public class PrivateMethodsInterfaces {
    public Duration getDuration(LocalDateTime date) {
        MyInterface myInterface = new MyInterface() {}; // Anonymous class to implement the interface
        Duration duration = myInterface.defaultMethod(date);
        System.out.println("Calculating duration from " + date + " to now is " + duration.toMinutes() + " minutes.");
        return duration;
    }
}


