package br.com.treinamentos.diversos.java10;

import java.util.HashMap;
import java.util.Map;

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
