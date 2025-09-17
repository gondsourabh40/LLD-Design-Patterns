package com.designpattern.pubsubmultithread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue<T> {
    private final BlockingQueue<T> queue = new LinkedBlockingQueue<>();

    public void publish(T message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public T consume(){
        try {
            return queue.take();
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
