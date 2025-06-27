package br.com.releases.java8;

import org.junit.jupiter.api.Test;

class DefaultMethodTest {
    private final DefaultMethod defaultMethod = new DefaultMethod();

    @Test
    void DefaultMethod() {
        this.defaultMethod.sumMethod(10);
    }

}