package br.com.releases.java9;

//Explanation
//Private methods in interfaces allow you to define methods that can be
//shared among default methods within the same interface. This feature,
//introduced in Java 9, helps reduce code duplication and improve
//maintainability by allowing common functionality to be encapsulated
//within the interface itself, rather than requiring it to be implemented
//in every class that implements the interface. Private methods cannot be
//called from outside the interface, and they can only be used by other
//default or static methods within the same interface.

import java.time.Duration;
import java.time.LocalDateTime;

interface MyInterface {
    // Default method that uses a private method
    default Duration defaultMethod(LocalDateTime date) {
        return calculateDuration(date, privateMethod());
    }

    // Private method that can be used by default methods
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


