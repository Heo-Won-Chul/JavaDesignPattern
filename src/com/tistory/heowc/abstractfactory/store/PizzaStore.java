package com.tistory.heowc.abstractfactory.store;

import com.tistory.heowc.abstractfactory.menu.Pizza;

public abstract class PizzaStore {

    public abstract Pizza order(String name);
}
