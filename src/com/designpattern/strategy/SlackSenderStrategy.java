package com.designpattern.strategy;

public class SlackSenderStrategy implements MessageSenderStrategy{
    @Override
    public void sendMessage() {
        System.out.println("Sending message over SLACK");
    }
}
