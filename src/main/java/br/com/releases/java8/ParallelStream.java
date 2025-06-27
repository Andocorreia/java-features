package br.com.releases.java8;

import java.util.stream.LongStream;

//Explanation
// This code demonstrates the use of parallel streams in Java to perform a summation of numbers from 1 to a specified limit.
// Parallel streams allow for concurrent processing of data, which can significantly improve performance for large datasets.
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
