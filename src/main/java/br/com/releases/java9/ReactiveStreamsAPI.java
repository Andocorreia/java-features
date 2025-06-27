package br.com.releases.java9;

import lombok.*;

import java.util.List;
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;

//Explanation
// The Reactive Streams API in Java 9 provides a standard for asynchronous stream processing with non-blocking backpressure.
// It allows developers to create and consume streams of data in a reactive manner,
// enabling efficient handling of large data sets and real-time data streams.
// The API consists of four main interfaces: Publisher, Subscriber, Subscription, and Processor.
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
