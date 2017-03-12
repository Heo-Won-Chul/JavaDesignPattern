package com.tistory.heowc.abstractfactory.store;

import com.tistory.heowc.abstractfactory.menu.CheesePizza;
import com.tistory.heowc.abstractfactory.menu.SeefoodPizza;

public class SeoulPizzaFactory implements PizzaFactory {

    public CheesePizza getCheesePizza() {
        return new CheesePizza();
    }

    public SeefoodPizza getSeefoodPizza() {
        return new SeefoodPizza();
    }
}
