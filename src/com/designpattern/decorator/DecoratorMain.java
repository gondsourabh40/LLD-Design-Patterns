package com.designpattern.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        PizzaBase pizzaBase = new PizzaBase();
        printDetail(pizzaBase);
        CheesePizzaDecorator cheesePizzaDecorator = new CheesePizzaDecorator(pizzaBase);
        printDetail(cheesePizzaDecorator);

        OnionLayerDecorator onionLayerDecorator = new OnionLayerDecorator(pizzaBase);
        printDetail(onionLayerDecorator);

        OnionLayerDecorator onionCheeseLayer = new OnionLayerDecorator(cheesePizzaDecorator);
        printDetail(onionCheeseLayer);
    }

    public static void printDetail(IPizza pizza){
        System.out.println(pizza.getDescription() + ", Cost = "+pizza.getCost());
    }
}
