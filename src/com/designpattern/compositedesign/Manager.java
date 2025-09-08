package com.designpattern.compositedesign;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String role;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String role) {
        this.name = name;
        this.role = role;
    }


    public void add(Employee employee){
        this.subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println(role + " : " + name + " and its subordinates");
        for(Employee employee:subordinates){
            employee.showDetails();
        }
    }

}
