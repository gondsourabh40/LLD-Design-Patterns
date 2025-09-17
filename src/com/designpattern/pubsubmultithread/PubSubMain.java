package com.designpattern.pubsubmultithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PubSubMain {
    public static void main(String[] args) {
        MessageQueue<String> queue = new MessageQueue<>();
        Publisher<String> publisher = new Publisher<>(queue);
        Subscriber<String> subscriber1 = message -> System.out.println("Subscriber 1 received: "
                + message);
        Subscriber<String> subscriber2 = message -> System.out.println("Subscriber 2 received: "
                + message);
        ExecutorService consumerExecutor = Executors.newFixedThreadPool(2);
        consumerExecutor.submit(new SubscriberWorker<String>(queue, subscriber1));
        consumerExecutor.submit(new SubscriberWorker<String>(queue, subscriber2));

        ExecutorService publisherExecutor = Executors.newFixedThreadPool(5);
        publisherExecutor.submit(() -> {
            for(int i = 1; i <= 5; i++) {
                publisher.publish("Message " + i);
                try {
                    Thread.sleep(500); // Simulate time taken to produce messages
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        publisherExecutor.submit(() -> {
            for(int i = 1; i <= 5; i++) {
                publisher.publish("Message-2 " + i);
                try {
                    Thread.sleep(500); // Simulate time taken to produce messages
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });


    }
}
