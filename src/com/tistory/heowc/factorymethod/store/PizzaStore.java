package com.tistory.heowc.factorymethod.store;

import com.tistory.heowc.factorymethod.menu.Pizza;

public abstract class PizzaStore {

    public abstract Pizza order(String name);
}
