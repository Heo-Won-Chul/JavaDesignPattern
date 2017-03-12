package test.factorymethod;

import com.tistory.heowc.factorymethod.menu.CheesePizza;
import com.tistory.heowc.factorymethod.menu.Pizza;
import com.tistory.heowc.factorymethod.menu.SeafoodPizza;
import com.tistory.heowc.factorymethod.store.PizzaFactory;
import com.tistory.heowc.factorymethod.store.SeoulPizzaFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    Pizza firstPizza;
    Pizza secondPizza;

    @Before
    public void before_order() throws Exception {
        PizzaFactory factory = new SeoulPizzaFactory();
        firstPizza = factory.order("cheese");
        secondPizza = factory.order("seefood");

//        secondPizza = factory.order("potato");
//        NoSuchElementException : potato is not supported.
    }

    @Test
    public void test_cheesePizza() throws Exception {
        assertSame(firstPizza.getName(), new CheesePizza().getName());
    }

    @Test
    public void test_seefoodPizza() throws Exception {
        assertSame(secondPizza.getName(), new SeafoodPizza().getName());
    }
}
