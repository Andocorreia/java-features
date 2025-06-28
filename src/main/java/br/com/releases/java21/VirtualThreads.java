package br.com.releases.java21;

//Explicação
// Threads virtuais são uma nova funcionalidade introduzida no Java 21
// que permite a criação de threads leves e eficientes.
// Elas são projetadas para simplificar a programação concorrente,
// permitindo que os desenvolvedores criem e gerenciem threads de forma mais fácil e eficiente.

public class VirtualThreads {
    public void run() {
        Runnable task = () -> {
            System.out.println("Executando em: " + Thread.currentThread());
            try {
                Thread.sleep(1000); // Simula uma tarefa
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        // Cria e inicia 10 threads virtuais
        for (int i = 0; i < 10; i++) {
            Thread.startVirtualThread(task);
        }
        System.out.println("Todas as threads foram iniciadas.");
    }
}
