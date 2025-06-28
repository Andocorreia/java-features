package br.com.releases.java17;

// Explicação
// A partir do Java 17, a linguagem passou a oferecer mensagens mais detalhadas para
// NullPointerException, graças à JEP 358 – Helpful NullPointerExceptions. Essa melhoria
// ajuda os desenvolvedores a identificar exatamente qual variável estava nula no momento
// da exceção, facilitando muito o processo de depuração.

// Exemplo de código que causa NullPointerException
// Exception in thread "main" java.lang.NullPointerException:
// Cannot read field "price" because "product" is null
// at Main.main(Main.java:10)

public class CauseOfNullPointerException {

        public void name() {
            String name = null;
            printNameLength(name);
        }

        private void printNameLength(String name) {
            System.out.println("Comprimento do nome: " + name.length());
        }
}
