package com.tistory.heowc.command.command;

import com.tistory.heowc.command.LightReceiver;

public class TurnOffLightCommand implements Command {

    private LightReceiver light;

    public TurnOffLightCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
