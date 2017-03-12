package com.tistory.heowc.decorator;

public abstract class ToppingCake implements Cake {

    protected Cake cake;

    protected ToppingCake(Cake cake) {
        this.cake = cake;
    }
}
