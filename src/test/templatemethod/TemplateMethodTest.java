package test.templatemethod;

import com.tistory.heowc.templatemethod.*;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void test_orderAmericano() throws Exception {
        System.out.println("==================== Americano ====================");
        new Americano().order();
    }

    @Test
    public void test_orderIcedAmericano() throws Exception {
        System.out.println("==================== Iced Americano ====================");
        new IcedAmericano().order();
    }

    @Test
    public void test_orderCafeLatte() throws Exception {
        System.out.println("==================== Cafe Latte ====================");
        new CafeLatte().order();
    }

    @Test
    public void test_orderIcedCafeLatte() throws Exception {
        System.out.println("==================== Iced Cafe Latte ====================");
        new IcedCafeLatte().order();
    }

    @Test
    public void test_orderVanillaLatte() throws Exception {
        System.out.println("==================== Vanilla Latte ====================");
        new VanillaLatte().order();
    }

    @Test
    public void test_orderIcedVanillaLatte() throws Exception {
        System.out.println("==================== Iced Vanilla Latte ====================");
        new IcedVanillaLatte().order();
    }
}