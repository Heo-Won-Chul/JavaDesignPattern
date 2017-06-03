package com.tistory.heowc.state.state;

import com.tistory.heowc.state.PlayerContext;

public class StopState implements PlayerState {

    private PlayerContext context;

    public StopState(PlayerContext context) {
        this.context = context;
    }


    @Override
    public void action() {
        System.out.println("Stop ...");
        context.setPlayerState(this);
    }
}
