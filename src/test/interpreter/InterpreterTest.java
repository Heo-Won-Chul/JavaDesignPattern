package test.interpreter;

import com.tistory.heowc.interpreter.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest {

    private static String EXPRESSION = "{name} is age to {age}";

    private Expression expression;

    @Before
    public void before_init() {
        expression = new Evaluator(EXPRESSION);
    }

    @Test
    public void test_interpret() {
        Map<String, Expression> value = new HashMap<>();
        value.put("{name}", new StringExpression("Heo Won Chul"));
        value.put("{age}", new StringExpression("26"));
        System.out.println(expression.interpret(value));
    }
}
