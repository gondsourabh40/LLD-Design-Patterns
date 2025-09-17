package com.designpattern.pubsubmultithread;

public class Publisher<T> {
    private final MessageQueue<T> queue;

    public Publisher(MessageQueue<T> queue) {
        this.queue = queue;
    }

    public void publish(T message) {
        queue.publish(message);
    }
}
