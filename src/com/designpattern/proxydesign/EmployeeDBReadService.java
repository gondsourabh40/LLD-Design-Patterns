package com.designpattern.proxydesign;

public class EmployeeDBReadService implements IEmployeeDataFetcher{

    @Override
    public String getEmployeeName(String userId) {
        System.out.println("Returning Employee from DB");
        return "employee-" + userId;
    }
}
