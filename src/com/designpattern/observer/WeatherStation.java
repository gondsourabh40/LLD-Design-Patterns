package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private String weather;
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setWeather(String weather){
        this.weather = weather;
        sendNotification();
    }
    private void sendNotification(){
        observers.forEach(observer -> observer.update(this.weather));
    }
}
