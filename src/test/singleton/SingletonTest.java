package test.singleton;

import com.tistory.heowc.singleton.Singleton;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void test_singleton() throws Exception {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(singleton1, singleton2);
    }
}