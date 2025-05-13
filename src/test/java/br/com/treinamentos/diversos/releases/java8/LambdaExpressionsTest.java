package br.com.treinamentos.diversos.releases.java8;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExpressionsTest {

    @Test
    void multiplicateForFiveReturnsCorrectResultForPositiveNumber() {
        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        assertEquals(25, lambdaExpressions.multiplicateForFive(5));
    }

    @Test
    void isValuePrintsMessageWhenValueIsFound() {
        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        var outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        lambdaExpressions.isValue(4);

        String expectedOutput = "Value found";
        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out); // Reset System.out
    }

}