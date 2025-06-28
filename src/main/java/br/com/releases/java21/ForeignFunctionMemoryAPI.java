package br.com.releases.java21;

//Explicação
// A Foreign Function & Memory API no Java 21 permite que você interaja
// com código nativo (como bibliotecas C) e memória fora da JVM de forma
// segura e eficiente — sem precisar usar o JNI (Java Native Interface),
// que é mais complexo e propenso a erros.

// Utilização:
// Chamar funções de bibliotecas nativas (como libc, OpenGL, etc.).
// Manipular buffers de memória fora do heap da JVM.
// Criar bindings para bibliotecas C sem JNI.

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public class ForeignFunctionMemoryAPI {
    public void run() {
        // Cria um "arena" para gerenciar a memória nativa
        try (Arena arena = Arena.ofConfined()) {
            // Aloca espaço para um inteiro
            MemorySegment segment = arena.allocate(ValueLayout.JAVA_INT);

            // Escreve um valor na memória
            segment.set(ValueLayout.JAVA_INT, 0, 123);

            // Lê o valor da memória
            int value = segment.get(ValueLayout.JAVA_INT, 0);
            System.out.println("Valor lido da memória nativa: " + value);
        }
    }
}
