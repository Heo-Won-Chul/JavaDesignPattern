package com.tistory.heowc.factorymethod.store;

import com.tistory.heowc.factorymethod.menu.CheesePizza;
import com.tistory.heowc.factorymethod.menu.Pizza;
import com.tistory.heowc.factorymethod.menu.SeafoodPizza;

import java.util.NoSuchElementException;

public class SeoulPizzaFactory extends PizzaFactory {

    @Override
    public Pizza order(String name) {
        if ("cheese".equals(name)) {
           return new CheesePizza();
        }

        if ("seefood".equals(name)) {
            return new SeafoodPizza();
        }

        throw new NoSuchElementException(name + " is not supported.");
    }
}
