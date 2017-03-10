package com.tistory.heowc.abstractfactory.menu;

public class SeafoodPizza extends Pizza {

    private String name = "seefood";
    private Long   price = 10000L;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SeafoodPizza{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
