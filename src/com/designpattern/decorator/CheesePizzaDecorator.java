package com.designpattern.decorator;

public class CheesePizzaDecorator implements IPizza{

    private IPizza ipizza;
    public CheesePizzaDecorator(IPizza iPizza) {
        this.ipizza = iPizza;
    }

    @Override
    public String getDescription() {
        return "Cheese - "+this.ipizza.getDescription();
    }

    @Override
    public long getCost() {
        return 30 + this.ipizza.getCost();
    }
}
