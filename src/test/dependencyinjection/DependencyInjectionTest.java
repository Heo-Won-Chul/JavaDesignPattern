package test.dependencyinjection;

import com.tistory.heowc.dependencyinjection.User;
import com.tistory.heowc.dependencyinjection.repository.UserARepository;
import com.tistory.heowc.dependencyinjection.service.UserService;
import com.tistory.heowc.dependencyinjection.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class DependencyInjectionTest {

    private UserService userService;

    @Before
    public void before_init() throws Exception {
        userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserRepository(new UserARepository());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_duplicateInsert() throws Exception {
        userService.insert(new User(1, "wonchul"));
    }
}
