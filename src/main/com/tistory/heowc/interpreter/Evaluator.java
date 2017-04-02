package com.tistory.heowc.interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {

    private Expression syntaxExpression;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();

        if(expression.contains("{age}")) {
            expressionStack.push(new AgeExpression("{age}"));
        }

        if(expression.contains("{name}")) {
            expressionStack.push(new NameExpression("{name}"));
        }

        syntaxExpression = expressionStack.pop();
    }

    @Override
    public String interpret(Map<String, Expression> map) {
        return syntaxExpression.interpret(map);
    }
}
