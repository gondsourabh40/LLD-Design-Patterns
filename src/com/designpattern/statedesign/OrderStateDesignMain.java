package com.designpattern.statedesign;

import java.util.Date;

public class OrderStateDesignMain {

    public static void main(String[] args) {
        Order order = new Order("order-id", 30, "customerEmail@gmail.com");
        order.ship();
        order.pay();
        order.ship();
        order.deliver();
        order.cancel();
    }
}
