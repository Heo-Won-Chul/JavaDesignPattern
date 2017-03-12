package com.tistory.heowc.templatemethod;

public class IcedVanillaLatte extends CoffeeTemplate {

    public IcedVanillaLatte() {
        super(true, true, true);
    }

    protected void addOther() {
        addVanillaSyrup();
    }

    private void addVanillaSyrup() {
        System.out.println("바닐라 시럽 10g 추가");
    }
}
