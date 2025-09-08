package com.designpattern.builder;

public class HouseBuilderPatternMain {
    public static void main(String[] args) {
        // Build a small house
        House smallHouse = new House.HouseBuilder()
                .setRooms(2)
                .setFloors(1)
                .setGarage(false)
                .setGarden(true)
                .build();

        // Build a luxury house
        House luxuryHouse = new House.HouseBuilder()
                .setRooms(5)
                .setFloors(2)
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .build();

        System.out.println(smallHouse);
        System.out.println(luxuryHouse);
    }
}
