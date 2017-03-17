package com.tistory.heowc.state.state;

import com.tistory.heowc.state.PlayerContext;

public class PlayingState implements PlayerState {

    private PlayerContext context;

    public PlayingState(PlayerContext context) {
        this.context = context;
    }

    @Override
    public void action() {
        System.out.println("Playing ...");
        context.setPlayerState(this);
    }
}
