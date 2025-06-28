package br.com.releases.java9;

import lombok.*;

import java.util.List;
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;

// Explicação
// A partir do Java 9, a API de Streams reativa foi introduzida, permitindo a
// criação de fluxos assíncronos e reativos.
// A API Reactive Streams é uma especificação para processamento assíncrono de fluxos de dados,
// permitindo que os produtores e consumidores de dados se comuniquem de forma eficiente.
// A API é baseada no padrão Publisher-Subscriber, onde os Publishers produzem dados e os
// Subscribers consomem esses dados.
// A API Reactive Streams é útil para cenários onde você precisa lidar com grandes volumes de dados
// ou quando os dados são produzidos de forma assíncrona, como em aplicações web, sistemas
// de mensagens ou bancos de dados.

public class ReactiveStreamsAPI {
    public void async() {
        List<Pessoa> pessoaList = List.of(
                new Pessoa("Maria"),
                new Pessoa("João"),
                new Pessoa("Ana"),
                new Pessoa("Carlos"),
                new Pessoa("Fernanda"),
                new Pessoa("Roberto"),
                new Pessoa("Patrícia"),
                new Pessoa("Lucas"),
                new Pessoa("Juliana"),
                new Pessoa("Eduardo")
        );

        MySubscriber<Pessoa> subscriber = new MySubscriber<>();
        SubmissionPublisher<Pessoa> publisher = new SubmissionPublisher<>();
        publisher.subscribe(subscriber);

        pessoaList.forEach(pessoa -> {
            System.out.println(Thread.currentThread().getName() + " Publishing Item: " + pessoa.getName());
            publisher.submit(pessoa);
        });
        publisher.close();
    }
}

@NoArgsConstructor
class MySubscriber<Pessoa> implements Subscriber<Pessoa> {
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("Received Subscription");
        this.subscription = subscription;
        subscription.request(5);
    }

    @Override
    public void onNext(Pessoa item) {
        try {
            System.out.println(Thread.currentThread().getName() + " >> Received Item: " + item.toString());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        subscription.request(5);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error while getting the requested item");
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Completed");
    }
}


@AllArgsConstructor
@Getter
@ToString
class Pessoa {
    private String name;
}
