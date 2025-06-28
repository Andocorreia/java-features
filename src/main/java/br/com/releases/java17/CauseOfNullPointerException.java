package br.com.releases.java17;

//Explanation
// This code demonstrates a common cause of a NullPointerException in Java.
// It occurs when trying to access a method or property of an object that is null.
public class CauseOfNullPointerException {

        public void name() {
            String name = null;
            printNameLength(name);
        }

        private void printNameLength(String name) {
            System.out.println("Comprimento do nome: " + name.length());
        }
}
