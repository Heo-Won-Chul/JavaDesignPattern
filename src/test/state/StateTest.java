package test.state;

import com.tistory.heowc.state.PlayerContext;
import com.tistory.heowc.state.state.PlayingState;
import com.tistory.heowc.state.state.StartState;
import com.tistory.heowc.state.state.StopState;
import org.junit.Test;

public class StateTest {

    private PlayerContext playerContext = new PlayerContext();
    private PlayingState playingState = new PlayingState(playerContext);
    private StartState startState = new StartState(playerContext);
    private StopState stopState = new StopState(playerContext);

    @Test
    public void test_stop() {
        playerContext.setPlayerState(stopState);
        playerContext.getPlayerState().action();
    }

    @Test
    public void test_start() {
        playerContext.setPlayerState(startState);
        playerContext.getPlayerState().action();
    }

    @Test
    public void test_playing() {
        playerContext.setPlayerState(playingState);
        playerContext.getPlayerState().action();
    }
}
