package com.tistory.heowc.state.state;

public class StartState implements PlayerState {

    @Override
    public void action() {
        System.out.println("Start ...");
    }
}
