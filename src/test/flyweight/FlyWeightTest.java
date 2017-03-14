package test.flyweight;

import com.tistory.heowc.flyweight.Process;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.IntStream;

public class FlyWeightTest {

    private static Process PROCOESS;

    @BeforeClass
    public static void before_init() {
        PROCOESS = new Process();
    }

    @Test
    public void test_addThreads() {
        IntStream.range(0, 50)
                .forEach(val-> PROCOESS.start());
    }
}
