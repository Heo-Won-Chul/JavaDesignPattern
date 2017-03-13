package test.adapter.commission;

import com.tistory.heowc.adapter.SimpleBanner;
import com.tistory.heowc.adapter.commission.Logger2Banner;
import org.junit.Before;
import org.junit.Test;

public class CommissionAdapterTest {

    private static final String CONTENT = CommissionAdapterTest.class.getSimpleName();

    private SimpleBanner simpleBanner;
    private Logger2Banner logger2Banner;

    @Before
    public void before_init() {
        simpleBanner = new SimpleBanner(CONTENT);
        logger2Banner = new Logger2Banner(CONTENT);
    }

    @Test
    public void test_print() {
        simpleBanner.showWithSquare();
        logger2Banner.printDebug();
    }

    @Test
    public void test_print2() {
        simpleBanner.showWithStar();
        logger2Banner.printInfo();
    }
}
