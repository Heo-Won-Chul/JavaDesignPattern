package com.tistory.heowc.state.state;

public class PlayingState implements PlayerState {

    @Override
    public void action() {
        System.out.println("Playing ...");
    }
}
