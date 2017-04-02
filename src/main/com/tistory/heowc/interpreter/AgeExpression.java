package com.tistory.heowc.interpreter;

import java.util.Map;

public class AgeExpression implements Expression {

    private String age;

    public AgeExpression(String age) {
        this.age = age;
    }

    @Override
    public String interpret(Map<String, Expression> map) {
        return map.get(age).interpret(map);
    }
}
