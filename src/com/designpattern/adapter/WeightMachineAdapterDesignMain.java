package com.designpattern.adapter;

public class WeightMachineAdapterDesignMain {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachine());
        System.out.println(weightMachineAdapter.getWeightInKg());

    }
}
