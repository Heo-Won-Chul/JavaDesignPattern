package com.tistory.heowc.decorator;

public class WhippingCreamCake extends ToppingCake {

    public WhippingCreamCake(Cake cake) {
        super(cake);
    }

    public String getName() {
        return "생크림 " + cake.getName();
    }
}
