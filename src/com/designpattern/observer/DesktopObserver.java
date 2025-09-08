package com.designpattern.observer;

public class DesktopObserver implements Observer{

    @Override
    public void update(String weather) {
        System.out.println("Desktop observer" +":"+ weather);
    }
}
