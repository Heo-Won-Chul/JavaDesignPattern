package test.state;

import com.tistory.heowc.state.PlayerContext;
import com.tistory.heowc.state.state.PlayingState;
import com.tistory.heowc.state.state.StartState;
import com.tistory.heowc.state.state.StopState;
import org.junit.Test;

public class StateTest {

    private PlayerContext playerContext = new PlayerContext();

    @Test
    public void test_stop() {
        playerContext.setPlayerState(new StopState());
        playerContext.getPlayerState().action();
    }

    @Test
    public void test_start() {
        playerContext.setPlayerState(new StartState());
        playerContext.getPlayerState().action();
    }

    @Test
    public void test_playing() {
        playerContext.setPlayerState(new PlayingState());
        playerContext.getPlayerState().action();
    }
}
