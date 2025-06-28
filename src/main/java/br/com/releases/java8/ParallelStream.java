package br.com.releases.java8;

import java.util.stream.LongStream;

// Explicação
// O parallelStream() é um recurso da API de Streams do Java 8 que
// permite processar coleções de forma paralela, aproveitando múltiplos
// núcleos da CPU para melhorar o desempenho em operações que podem ser
// executadas simultaneamente.

// Vantagens
// Melhor desempenho em coleções grandes e operações pesadas.
// Uso automático de múltiplos núcleos da CPU.
// Código conciso, sem necessidade de gerenciar threads manualmente.

// Cuidados
// Ordem de execução não garantida (use forEachOrdered se necessário).
// Pode ser menos eficiente que stream() em coleções pequenas.
// Evite efeitos colaterais (como modificar variáveis externas).
// Nem toda operação se beneficia do paralelismo (ex: I/O, acesso a banco).

public class ParallelStream {
    public void run() {
        long num = 10_000_000_000L;
        somaFor(num);
        somaRangeClosedParallelStream(num);
    }

    private void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1L; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private void somaRangeClosedParallelStream(long num) {
        System.out.println("Range Closed Parallel Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
}
