package com.designpattern.factory;

public class Truck extends Vehicle{
    @Override
    public int getTotalWheel() {
        return 8;
    }

    @Override
    public void printVehicle() {
        System.out.println("Truck is vehicle");
    }
}
