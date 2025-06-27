package br.com.releases.java9;

import java.util.*;

//Explanation
//In Java, collection factory methods offer a concise way to create
//instances of collections like lists, sets, and maps directly, without
//needing to explicitly call constructors. Introduced in Java 9, these
//static methods simplify collection initialization, particularly for
//creating immutable collections.

public class FactoryMethodCollection {

    // List = Aceita documentos duplicados / Aceita informar o indice durante a inclusão
        // ArrayList = Ideal para listas que precisam de acesso rápido por índice.
        // LinkedList = Ideal para listas onde você precisa frequentemente adicionar ou remover elementos.
        // Vector = Usado em aplicações que requerem segurança em ambientes multithread.
        // Stack = Ideal para operações de pilha, como LIFO (Last In, First Out).
        // CopyOnWriteArrayList = Útil em cenários onde há muitas operações de leitura e poucas operações de modificação.

    // Set = Não aceita documentos duplicados
        // HashSet = Ideal quando você precisa de um conjunto de elementos sem duplicatas e não se importa com a ordem.
        // LinkedHashSet = Útil quando a ordem de inserção é importante e você ainda deseja operações rápidas.
        // TreeSet = Ideal quando você precisa de um conjunto que mantenha seus elementos ordenados.
        // EnumSet = Útil quando você está lidando apenas com enums e precisa de um conjunto.
        // CopyOnWriteArraySet = Útil em cenários onde há muitas operações de leitura e poucas operações de modificação.

    //Map = Trabalha com Chave e Valor / Não aceita indices duplicados
        // HashMap = Ideal para armazenar pares de chave-valor onde a ordem não é importante e onde você precisa de operações rápidas de inserção e busca.
        // LinkedHashMap = Útil quando a ordem de inserção é importante.
        // TreeMap = Ideal quando você precisa de um mapa que mantenha seus elementos ordenados.
        // EnumMap = Útil quando você está lidando apenas com enums e precisa de um mapa.
        // WeakHashMap = Útil para evitar vazamentos de memória, permitindo que os elementos sejam coletados pelo garbage collector.
        // IdentityHashMap = Útil em situações em que a identidade do objeto é mais importante do que seu valor.

    //Queue = Trabalha com FIFO (First In, First Out)
        // PriorityQueue = Útil quando você precisa de uma fila onde os elementos têm prioridades diferentes.
        // ArrayDeque = Ideal para implementar pilhas e filas de forma eficiente.
        // LinkedBlockingQueue = Útil em ambientes multithread onde você precisa de uma fila segura para threads.
        // ConcurrentLinkedQueue = Útil em ambientes multithread onde você precisa de uma fila não bloqueante.

    //Deque = Trabalha com FIFO e LIFO (First In, First Out e Last In, First Out)
        // ArrayDeque = Ideal para implementar pilhas e filas de forma eficiente.
        // LinkedBlockingDeque = Útil em ambientes multithread onde você precisa de uma deque segura para threads.
        // ConcurrentLinkedDeque = Útil em ambientes multithread onde você precisa de uma deque não bloqueante.

    //SortedSet = Trabalha com conjuntos ordenados
        // NavigableSet = Extensão do SortedSet que fornece métodos adicionais para navegação.
        // SortedMap = Trabalha com mapas ordenados
        // NavigableMap = Extensão do SortedMap que fornece métodos adicionais para navegação.

    //SortedMap = Trabalha com mapas ordenados
        // NavigableMap = Extensão do SortedMap que fornece métodos adicionais para navegação.
        //TreeMap = Mantém as chaves ordenadas.

    //NavigableSet = Trabalha com conjuntos ordenados e fornece métodos adicionais para navegação.
        // NavigableMap = Extensão do SortedMap que fornece métodos adicionais para navegação.
        // TreeSet = Inclui métodos adicionais para navegação, como lower(), higher(), floor(), e ceiling().

    //NavigableMap = Trabalha com mapas ordenados e fornece métodos adicionais para navegação.
        // TreeMap = Inclui métodos adicionais para navegação, como lowerEntry(), higherEntry(), floorEntry(), e ceilingEntry().

    //BlockingQueue = Trabalha com filas que suportam operações de bloqueio.
        // ArrayBlockingQueue = Implementa uma fila de capacidade fixa que bloqueia quando cheia.
        // LinkedBlockingQueue = Implementa uma fila de capacidade opcional que bloqueia quando cheia.
        // PriorityBlockingQueue = Implementa uma fila de prioridade que suporta operações de bloqueio.
        // DelayQueue = Implementa uma fila onde os elementos não podem ser retirados até que um certo tempo tenha passado.

    //Concurrent Collections = Coleções projetadas para uso em ambientes multithread, que oferecem segurança de thread sem a necessidade de sincronização explícita. Exemplos incluem:
        // ConcurrentHashMap= Uma versão thread-safe de HashMap.
        // CopyOnWriteArrayList =  Uma lista que cria uma cópia do array quando modificado, permitindo leituras simultâneas sem bloqueio.
        // BlockingDeque = Uma interface que estende Deque e é projetada para uso em ambientes multithread.

    //Stack = Trabalha com pilhas (LIFO - Last In, First Out)
        // ArrayDeque = Ideal para implementar pilhas e filas de forma eficiente.
        // LinkedBlockingDeque = Útil em ambientes multithread onde você precisa de uma deque segura para threads.
        // ConcurrentLinkedDeque = Útil em ambientes multithread onde você precisa de uma deque não bloqueante.

    public List<String> fromList() {

        List<String> nomes = new ArrayList<>();
        nomes.add("Vanessa");
        nomes.add("André");
        nomes.add("Matheus");
        nomes.add("Vitoria");

        this.printList("Itens adicionados ao List:", nomes);

        this.orderList(nomes);

        this.removeList(nomes);

        return Collections.unmodifiableList(nomes);
    }

    public List<String> toList() {
        return List.of("Marcia", "Giselle");
    }

    public Set<String> fromSet() {
        Set<String> nomes = new HashSet<>();
        nomes.add("Grimaldo");
        nomes.add("Rita");
        nomes.add("Fabio");
        nomes.add("Cristina");

        this.printSet("Itens adicionados ao Set:", nomes);

        this.orderSet(nomes);

        this.removeSet(nomes);

        return Collections.unmodifiableSet(nomes);
    }

    public Set<String> toSet() {
        return Set.of("Alan", "Nubia");
    }

    public Map<String, String> toMap() {
        Map<String, String> nomes = new HashMap<>();
        nomes.put("Sogro", "Bento");
        nomes.put("Sogra", "Adelaide");
        nomes.put("Cunhada", "Nubia");
        nomes.put("Cunhado", "Alan");

        this.printMap("Itens adicionados ao Map:", nomes);

        this.orderMap(nomes);

        this.removeMap(nomes);

        return Collections.unmodifiableMap(nomes);
    }

    public Map<String, String> fromMap() {
        return Map.of("Pai", "Grimaldo", "Mãe", "Rita");
    }

    private void printList(String text, List<String> list) {
        list.forEach(item -> System.out.println(text + item));
        System.out.println("---------------------------------------------------------------");
    }

    private void orderList(List<String> list) {
        Collections.sort(list);
        this.printList("Itens após as Ordenação:", list);
    }

    private void removeList(List<String> list) {
        var indice = 0;
        var nome = "Matheus";

        System.out.println("Removendo Itens:" + indice + " - " + nome);
        list.remove(indice); //Removendo por indice

        list.remove(nome); //Removendo por valor

        this.printList("Itens após as remoções:", list);
    }

    private void printSet(String text, Set<String> set) {
        set.forEach(item -> System.out.println(text + item));
        System.out.println("---------------------------------------------------------------");
    }

    private void orderSet(Set<String> set) {
        Set<String> setOrdenado = new TreeSet<>(set);
        this.printSet("Itens após as Ordenação:", setOrdenado);
    }

    private void removeSet(Set<String> set) {
        var nome = "Cristina";

        System.out.println("Removendo Itens:" + nome);

        set.remove(nome);

        this.printSet("Itens após as remoções:", set);
    }

    private void printMap(String text, Map<String, String> map) {
        map.forEach((key, value) -> System.out.println(text + key + "-" +value));
        System.out.println("---------------------------------------------------------------");
    }

    private void orderMap(Map<String, String> map) {
        Map<String, String> mapOrdenado = new TreeMap<>(map);

        this.printMap("Itens após as Ordenação:", mapOrdenado);
    }

    private void removeMap(Map<String, String> map) {
        var key = "Cunhado";

        System.out.println("Removendo Itens:" + key);

        map.remove(key);

        this.printMap("Itens após a remoçõão:", map);
    }
}
