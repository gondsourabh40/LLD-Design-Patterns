package com.designpattern.command;

public class RemoteCommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnLightCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffLightCommand);
        remoteControl.pressButton();
    }
}
