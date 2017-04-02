package com.tistory.heowc.interpreter;

import java.util.Map;

public interface Expression {
    String interpret(Map<String, Expression> map);
}
