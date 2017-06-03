package com.tistory.heowc.interpreter;

import java.util.Map;

public class NameExpression implements Expression {

    private String name;

    public NameExpression(String name) {
        this.name = name;
    }

    @Override
    public String interpret(Map<String, Expression> map) {
        return map.get(name).interpret(map);
    }
}
