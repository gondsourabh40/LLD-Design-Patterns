package com.designpattern.proxydesign;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCacheBackedDBReadService implements IEmployeeDataFetcher{
    IEmployeeDataFetcher employeeDataFetcher;
    Map<String, String> userEmployeeName;
    public EmployeeCacheBackedDBReadService() {
        this.employeeDataFetcher = new EmployeeDBReadService();
        this.userEmployeeName = new HashMap<>();
    }

    @Override
    public String getEmployeeName(String userId) {
        if(!userEmployeeName.containsKey(userId)){
            userEmployeeName.put(userId, employeeDataFetcher.getEmployeeName(userId));
        }
        return userEmployeeName.get(userId);
    }
}
