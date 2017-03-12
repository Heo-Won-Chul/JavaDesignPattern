package test.builder;

import com.tistory.heowc.builder.Person;
import com.tistory.heowc.builder.PersonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    private PersonBuilder builder;
    private Person person;

    @Before
    public void before_init() {
        builder = new PersonBuilder();
    }

    @Test
    public void test_person() throws Exception {
        person = builder
                .setRrNumber("920708-1XXXXXX")
                .setName("Heo Won Chul")
                .setJob("Developer")
                .setUrl("http://heowc.tistory.com")
                .build();

        assertNotNull(person);
    }
}
