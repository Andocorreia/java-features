package br.com.releases.java17;

public class CauseOfNullPointerException {

        public void name() {
            String name = null;
            printNameLength(name);
        }

        private void printNameLength(String name) {
            System.out.println("Comprimento do nome: " + name.length());
        }
}
