package com.designpattern.statedesign;

import java.time.LocalDateTime;

public class Order {
    private String orderId;
    private double amount;
    private String customerEmail;
    private LocalDateTime createdAt;
    private OrderState state;

    public Order(String orderId, double amount, String customerEmail) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerEmail = customerEmail;
        this.createdAt = LocalDateTime.now();
        this.state = new NewOrderState();
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void ship(){
        this.state.ship(this);
    }

    public void pay(){
        this.state.pay(this);
    }

    public void deliver(){
        this.state.deliver(this);
    }

    public void cancel() {
        this.state.cancel(this);
    }
}
