package br.com.releases.java10;

import java.util.HashMap;
import java.util.Map;

// Explicação
// A partir do Java 10, é possível usar a palavra-chave 'var' para inferência de tipo de variáveis locais.
// Isso significa que o compilador determina automaticamente o tipo da variável com base no valor
// atribuído a ela.
// A inferência de tipo de variável é útil para tornar o código mais conciso e legível, especialmente
// quando o tipo é óbvio a partir do contexto. No entanto, é importante lembrar que 'var' só pode
// ser usado para variáveis locais, não para campos de classe, parâmetros de metodo ou tipos de retorno.

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
