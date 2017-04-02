package com.tistory.heowc.interpreter;

import java.util.Map;

public class StringExpression implements Expression {

    private String value;

    public StringExpression(String value) {
        this.value = value;
    }

    @Override
    public String interpret(Map<String, Expression> map) {
        return this.value;
    }
}
