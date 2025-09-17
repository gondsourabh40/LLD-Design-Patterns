package com.designpattern.pubsubmultithread;

public interface Subscriber<T> {
    void onMessage(T message);
}
