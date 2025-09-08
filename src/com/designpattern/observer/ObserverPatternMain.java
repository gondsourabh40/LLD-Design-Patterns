package com.designpattern.observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new DesktopObserver());
        weatherStation.setWeather("COLD");
        weatherStation.setWeather("HOT");


        weatherStation.addObserver(new MobileObserver("383847343874"));

        weatherStation.setWeather("SPRING");
        weatherStation.setWeather("Very high temperature");
    }
}
