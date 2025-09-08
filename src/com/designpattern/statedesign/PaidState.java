package com.designpattern.statedesign;

public class PaidState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Order already paid.");
    }
    @Override
    public void ship(Order order) {
        System.out.println("Order " + order.getOrderId() +
                " shipped to customer: " + order.getCustomerEmail());
        order.setState(new ShippedState());
    }
    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver before shipping.");
    }
    @Override
    public void cancel(Order order) {
        System.out.println("Refunding $" + order.getAmount() +
                " to customer " + order.getCustomerEmail());
        order.setState(new CancelledState());
    }
}
