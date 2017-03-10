package test.iterator;

import com.tistory.heowc.iterator.SimpleIterator;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IteratorTest {

    private List<String> list;

    @Before
    public void before_init() {
        list = Arrays.asList( "wonchul", "naeun", "tistory", "heowc" );
    }

    @Test
    public void test_iterator() throws Exception {
        SimpleIterator iterator = new SimpleIterator(list);

        while ( iterator.hasNext() ) {
            assertNotNull(iterator.next());
        }
    }
}
