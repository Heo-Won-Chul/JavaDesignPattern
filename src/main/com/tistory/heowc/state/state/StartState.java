package com.tistory.heowc.state.state;

import com.tistory.heowc.state.PlayerContext;

public class StartState implements PlayerState {

    private PlayerContext context;

    public StartState(PlayerContext context) {
        this.context = context;
    }

    @Override
    public void action() {
        System.out.println("Start ...");
        context.setPlayerState(this);
    }
}
