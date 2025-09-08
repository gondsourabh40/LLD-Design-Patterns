package com.designpattern.strategy;

public class MessageSenderContext {

    private MessageSenderStrategy messageSenderStrategy;
    public MessageSenderContext(MessageSenderStrategy messageSenderStrategy) {
        this.messageSenderStrategy = messageSenderStrategy;
    }

    public void sendMessage(){
        this.messageSenderStrategy.sendMessage();
    }
}
