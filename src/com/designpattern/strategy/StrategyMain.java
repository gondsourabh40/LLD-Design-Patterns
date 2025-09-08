package com.designpattern.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        sendMessageOverEmail();
        sendMessageOverSlack();
    }

    private static void sendMessageOverSlack() {
        MessageSenderContext messageSenderContext = new MessageSenderContext(new SlackSenderStrategy());
        messageSenderContext.sendMessage();
    }

    private static void sendMessageOverEmail() {
        MessageSenderContext messageSenderContext = new MessageSenderContext(new EmailSenderStrategy());
        messageSenderContext.sendMessage();
    }
}
