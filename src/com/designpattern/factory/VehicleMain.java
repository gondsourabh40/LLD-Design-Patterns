package com.designpattern.factory;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        //Car
        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
        System.out.print(vehicle.getTotalWheel());
        vehicle.printVehicle();

        //Truck
        vehicle = vehicleFactory.getVehicle(VehicleType.TRUCK);
        System.out.print(vehicle.getTotalWheel());
        vehicle.printVehicle();
    }
}
