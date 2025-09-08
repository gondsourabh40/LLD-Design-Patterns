package com.designpattern.compositedesign;

public class EmployeeCompositeDesign {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Sourabh", "Backend developer");

        Employee employee2 = new Developer("Gourav", "Full stack developer");

        Employee employee3 = new Developer("Shivangi", "Associate developer");

        Manager manager1 = new Manager("Jack", "Backend Manager");
        manager1.add(employee1);
        manager1.add(employee2);
        manager1.add(employee3);

        Manager seniorManager = new Manager("Senior John", "Senior Backend Manager");
        seniorManager.add(manager1);

        seniorManager.showDetails();
    }
}
