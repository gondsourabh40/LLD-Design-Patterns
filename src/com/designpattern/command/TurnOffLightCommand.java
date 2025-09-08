package com.designpattern.command;

public class TurnOffLightCommand implements Command{

    private Light light;
    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
