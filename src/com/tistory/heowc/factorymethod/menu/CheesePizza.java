package com.tistory.heowc.factorymethod.menu;

public class CheesePizza extends Pizza {

    private String name = "cheese";
    private Long price = 8000L;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
