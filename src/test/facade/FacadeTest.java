package test.facade;

import com.tistory.heowc.facade.Activity;
import com.tistory.heowc.facade.Application;
import com.tistory.heowc.facade.Service;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

    private Application application;

    @Before
    public void before_init() {
        application = new Application(new Activity(), new Service());
    }

    @Test
    public void test_start() {
        application.start();
    }
}
