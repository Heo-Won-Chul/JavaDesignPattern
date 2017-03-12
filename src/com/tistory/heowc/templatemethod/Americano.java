package com.tistory.heowc.templatemethod;

public class Americano extends CoffeeTemplate {

    public Americano() {
        super(false, false, false);
    }

    @Override
    protected void addOther() {
        // null
    }
}
