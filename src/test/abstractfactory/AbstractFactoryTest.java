package test.abstractfactory;

import com.tistory.heowc.abstractfactory.store.SeoulPizzaFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {

    SeoulPizzaFactory factory;

    @Before
    public void before_init() {
        factory = new SeoulPizzaFactory();
    }

    @Test
    public void test_orderCheesePizza() throws Exception {
        assertSame(factory.getCheesePizza().order(),
                    "CheesePizza");
    }

    @Test
    public void test_orderSeefoodPizza() throws Exception {
        assertSame(factory.getSeefoodPizza().order(),
                    "SeefoodPizza");
    }
}
