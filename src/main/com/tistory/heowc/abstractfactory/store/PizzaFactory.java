package com.tistory.heowc.abstractfactory.store;

import com.tistory.heowc.abstractfactory.menu.CheesePizza;
import com.tistory.heowc.abstractfactory.menu.SeefoodPizza;

public interface PizzaFactory {

    public CheesePizza getCheesePizza();
    public SeefoodPizza getSeefoodPizza();
}
