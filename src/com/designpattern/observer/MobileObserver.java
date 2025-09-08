package com.designpattern.observer;

public class MobileObserver implements Observer{
    private String mobileNo;
    public MobileObserver(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public void update(String weather) {
        System.out.println("Updating on Mobile : "+ mobileNo +":"+ weather);
    }
}
