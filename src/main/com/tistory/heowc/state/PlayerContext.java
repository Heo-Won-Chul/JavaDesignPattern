package com.tistory.heowc.state;

import com.tistory.heowc.state.state.PlayerState;

public class PlayerContext {

    private PlayerState playerState;

    public PlayerContext() {
        playerState = null;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }
}
