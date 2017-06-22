package com.tistory.heowc.state.state;

public class StopState implements PlayerState {

    @Override
    public void action() {
        System.out.println("Stop ...");
    }
}
