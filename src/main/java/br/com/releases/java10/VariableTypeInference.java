package br.com.releases.java10;

import java.util.HashMap;
import java.util.Map;

//Explanation
//Java type inference is the ability of the Java compiler to automatically
//deduce the data type of a variable or expression, without explicit declaration.
//Introduced in Java 7 with the "diamond operator" <>, it was significantly
//enhanced in Java 10 with the var keyword for local variables.

public class VariableTypeInference {

    public Map<Integer, String> variableTypeInference() {
        var obj = new HashMap<Integer, String>();

        obj.put(1, "Gol");
        obj.put(2, "Brasilia");
        obj.put(3, "Fusca");
        obj.put(4, "Fox");

        obj.forEach((key, value) -> System.out.println(key + " - " + value));

        return obj;
    }
}
