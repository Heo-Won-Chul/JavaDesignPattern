package com.tistory.heowc.templatemethod;

public class IcedAmericano extends CoffeeTemplate {

    public IcedAmericano() {
        super(true, false, false);
    }

    @Override
    protected void addOther() {
        // null
    }
}
