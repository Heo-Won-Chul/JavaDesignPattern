package test.adapter.inheritance;

import com.tistory.heowc.adapter.inheritance.LoggerBanner;
import com.tistory.heowc.adapter.SimpleBanner;
import org.junit.Before;
import org.junit.Test;

public class InheritanceAdapterTest {

    private static final String CONTENT = InheritanceAdapterTest.class.getSimpleName();

    private SimpleBanner simpleBanner;
    private LoggerBanner loggerBanner;

    @Before
    public void before_init() {
        simpleBanner = new SimpleBanner(CONTENT);
        loggerBanner = new LoggerBanner(CONTENT);
    }

    @Test
    public void test_print() {
        simpleBanner.showWithSquare();
        loggerBanner.printDebug();
    }

    @Test
    public void test_print2() {
        simpleBanner.showWithStar();
        loggerBanner.printInfo();
    }
}
