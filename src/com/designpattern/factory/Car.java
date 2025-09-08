package com.designpattern.factory;

public class Car extends Vehicle{
    @Override
    public int getTotalWheel() {
        return 4;
    }

    @Override
    public void printVehicle() {
        System.out.println("Vehicle is car");
    }
}
