package test.command;

import com.tistory.heowc.command.LightReceiver;
import com.tistory.heowc.command.SwitchInvoker;
import com.tistory.heowc.command.command.TurnOffLightCommand;
import com.tistory.heowc.command.command.TurnOnLightCommand;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {

    private SwitchInvoker switchInvoker;

    @Before
    public void before_init() {
        LightReceiver lightReceiver = new LightReceiver("Home");
        switchInvoker = new SwitchInvoker(new TurnOnLightCommand(lightReceiver),
                                            new TurnOffLightCommand(lightReceiver));
    }

    @Test
    public void test_onAndOff() {
        switchInvoker.on();
        switchInvoker.off();
    }
}
