package com.designpattern.statedesign;

class CancelledState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Order is cancelled. No payment allowed.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order is cancelled. Cannot ship.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order is cancelled. Cannot deliver.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order already cancelled.");
    }
}
