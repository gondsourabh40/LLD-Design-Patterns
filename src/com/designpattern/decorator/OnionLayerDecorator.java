package com.designpattern.decorator;

public class OnionLayerDecorator implements IPizza{

    private IPizza iPizza;

    public OnionLayerDecorator(IPizza iPizza) {
        this.iPizza = iPizza;
    }

    @Override
    public String getDescription() {
        return "Onion layer - "+this.iPizza.getDescription();
    }

    @Override
    public long getCost() {
        return 50 + this.iPizza.getCost();
    }
}
