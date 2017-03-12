package test.decorator;

import com.tistory.heowc.decorator.ChocolateCake;
import com.tistory.heowc.decorator.SimpleCake;
import com.tistory.heowc.decorator.WhippingCreamCake;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    SimpleCake simpleCake;
    ChocolateCake chocolateCake;
    WhippingCreamCake whippingCreamCake;
    WhippingCreamCake whippingCreamAndChocolateCake;

    @Before
    public void before_init() {
        simpleCake = new SimpleCake();
        chocolateCake = new ChocolateCake(simpleCake);
        whippingCreamCake = new WhippingCreamCake(simpleCake);
        whippingCreamAndChocolateCake = new WhippingCreamCake(chocolateCake);
    }

    @Test
    public void test_simpleCake() {
        assertEquals(simpleCake.getName(), "케이크");
    }

    @Test
    public void test_chocolateCake() {
        assertEquals(chocolateCake.getName(), "초콜렛 케이크");
    }

    @Test
    public void test_whippingCreamCake() {
        assertEquals(whippingCreamCake.getName(), "생크림 케이크");
    }

    @Test
    public void test_whippingCreamAndChocolateCake() {
        assertEquals(whippingCreamAndChocolateCake.getName(), "생크림 초콜렛 케이크");
    }
}
