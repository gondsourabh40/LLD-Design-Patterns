package com.designpattern.pubsubmultithread;

public class SubscriberWorker<T> implements Runnable{
    private final MessageQueue<T> queue;
    private final Subscriber<T> subscriber;

    public SubscriberWorker(MessageQueue<T> queue, Subscriber<T> subscriber) {
        this.queue = queue;
        this.subscriber = subscriber;
    }

    @Override
    public void run() {
        while (true) {
            T message = queue.consume();
            if (message != null) {
                subscriber.onMessage(message);
            }
        }
    }
}
