package com.tistory.heowc.abstractfactory.store;

import com.tistory.heowc.abstractfactory.menu.CheesePizza;
import com.tistory.heowc.abstractfactory.menu.Pizza;
import com.tistory.heowc.abstractfactory.menu.SeafoodPizza;

import java.util.NoSuchElementException;

public class SeoulPizzaStore extends PizzaStore {

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
