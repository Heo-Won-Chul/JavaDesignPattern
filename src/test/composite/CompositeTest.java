package test.composite;

import com.tistory.heowc.composite.Directory;
import com.tistory.heowc.composite.File;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeTest {

    Directory root;

    @Before
    public void before_create() {
        root = new Directory("root");

        Directory programFiles = new Directory("program files");
        programFiles.add(new File("java"));
        programFiles.add(new File("intellij"));
        programFiles.add(new Directory("tomcat"));

        root.add(programFiles);
        root.add(new File("system"));
    }

    @Test
    public void test_composite() throws Exception {
        System.out.println(root.toString());
        assertNotNull(root);
    }
}
