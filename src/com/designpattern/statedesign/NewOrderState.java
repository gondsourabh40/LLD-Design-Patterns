package com.designpattern.statedesign;

class NewOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("Payment of $" + order.getAmount() +
                " received for order " + order.getOrderId());
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship. Order not paid yet.");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver. Order not paid yet.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order " + order.getOrderId() + " cancelled.");
        order.setState(new CancelledState());
    }
}
