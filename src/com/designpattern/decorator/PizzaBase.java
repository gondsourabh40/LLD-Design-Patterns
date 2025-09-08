package com.designpattern.decorator;

public class PizzaBase implements IPizza{

    @Override
    public String getDescription() {
        return "pizza-base";
    }

    @Override
    public long getCost() {
        return 5;
    }
}
