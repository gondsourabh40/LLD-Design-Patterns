package com.designpattern.strategy;

public class EmailSenderStrategy implements MessageSenderStrategy {

    //Initialize required field
    public EmailSenderStrategy() {

    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message via EMAIL");
    }
}
