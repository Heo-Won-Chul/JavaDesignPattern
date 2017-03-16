package test.prototype;

import com.tistory.heowc.prototype.Cookie;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void test_createCookie1() {
        final Cookie cookie = new Cookie();

        assertEquals(
            IntStream.range(0, 50)
                .mapToObj(value -> (Cookie) cookie.make())
                .filter(cookies -> cookies == cookie.make())
                .count(),
            0);
    }

    @Test
    public void test_createCookie2() {
        final Cookie cookie = new Cookie();

        assertEquals(
                IntStream.range(0, 50)
                        .mapToObj(value -> (Cookie) cookie.make())
                        .count(),
                50);
    }
}
