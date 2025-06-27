package br.com.releases.java10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableTypeInferenceTest {

    @Test
    void variableTypeInferencePrintsAllKeyValuePairs() {
        VariableTypeInference variableTypeInference = new VariableTypeInference();
        var map = variableTypeInference.variableTypeInference();

        assertEquals(map.size(), 4);

    }
}
