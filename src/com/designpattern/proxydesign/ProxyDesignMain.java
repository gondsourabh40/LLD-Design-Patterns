package com.designpattern.proxydesign;

public class ProxyDesignMain {
    public static void main(String[] args) {
        //Without Redis read
        IEmployeeDataFetcher employeeDataFetcher = new EmployeeDBReadService();
        System.out.println("Without Cache proxy");
        fetchTheEmployeeName(employeeDataFetcher);


        employeeDataFetcher = new EmployeeCacheBackedDBReadService();
        System.out.println("With Cache proxy");
        fetchTheEmployeeName(employeeDataFetcher);
    }

    private static void fetchTheEmployeeName(IEmployeeDataFetcher employeeDataFetcher) {
        for(int j=0;j<2;j++) {
            for (int i = 0; i < 5; i++) {
                String employeeName = employeeDataFetcher.getEmployeeName("" + i);
                System.out.println("UserName for " + i + " is " + employeeName);
            }
        }
    }
}
