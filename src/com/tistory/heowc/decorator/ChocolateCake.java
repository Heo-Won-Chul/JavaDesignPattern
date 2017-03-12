package com.tistory.heowc.decorator;

public class ChocolateCake extends ToppingCake {

    public ChocolateCake(Cake cake) {
        super(cake);
    }

    public String getName() {
        return "초콜렛 " + cake.getName();
    }
}
