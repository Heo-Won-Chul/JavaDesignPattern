package com.tistory.heowc.templatemethod;

public abstract class CoffeeTemplate {

    private boolean isIced;
    private boolean isLatte;
    private boolean isOther;

    protected CoffeeTemplate(boolean isIced, boolean isLatte, boolean isOther) {
        this.isIced = isIced;
        this.isLatte = isLatte;
        this.isOther = isOther;
    }

    public void order() {
        addEspresso();

        if( isIced ) {
            addIce();
        }

        if( isLatte ){
            addMilk();
        } else {
            addWater();
        }

        if( isOther ) {
            addOther();
        }
    }

    private void addEspresso() {
        System.out.println("에스프레소 30mL 추가");
    }

    private void addMilk() {
        System.out.println("우유 200mL 추가");
    }

    private void addWater() {
        System.out.println("물 200mL 추가");
    }

    private void addIce() {
        System.out.println("얼음 100g 추가");
    }

    protected abstract void addOther();
}
