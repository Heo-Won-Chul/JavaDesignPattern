package test.abstractfactory;

import com.tistory.heowc.abstractfactory.menu.CheesePizza;
import com.tistory.heowc.abstractfactory.menu.Pizza;
import com.tistory.heowc.abstractfactory.menu.SeafoodPizza;
import com.tistory.heowc.abstractfactory.store.PizzaStore;
import com.tistory.heowc.abstractfactory.store.SeoulPizzaStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {

    Pizza firstPizza;
    Pizza secondPizza;

    @Before
    public void before_order() throws Exception {
        PizzaStore store = new SeoulPizzaStore();
        firstPizza = store.order("cheese");
        secondPizza = store.order("seefood");

        System.out.println(firstPizza.toString());
        System.out.println(secondPizza.toString());

//        secondPizza = store.order("potato");
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
