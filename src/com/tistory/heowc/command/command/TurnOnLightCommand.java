package com.tistory.heowc.command.command;

import com.tistory.heowc.command.LightReceiver;

public class TurnOnLightCommand implements Command {

    private LightReceiver light;

    public TurnOnLightCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
