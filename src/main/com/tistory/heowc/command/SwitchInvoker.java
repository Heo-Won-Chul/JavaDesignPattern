package com.tistory.heowc.command;

import com.tistory.heowc.command.command.TurnOffLightCommand;
import com.tistory.heowc.command.command.TurnOnLightCommand;

public class SwitchInvoker {

    private TurnOnLightCommand turnOnLightCommand;
    private TurnOffLightCommand turnOffLightCommand;

    public SwitchInvoker(TurnOnLightCommand turnOnLightCommand,
                         TurnOffLightCommand turnOffLightCommand) {
        this.turnOnLightCommand = turnOnLightCommand;
        this.turnOffLightCommand = turnOffLightCommand;
    }

    public void on() {
        turnOnLightCommand.execute();
    }

    public void off() {
        turnOffLightCommand.execute();
    }
}
