package test.visit;

import com.tistory.heowc.visit.DirectoryPart;
import com.tistory.heowc.visit.FilePart;
import com.tistory.heowc.visit.LinuxPathVisitor;
import org.junit.Test;

public class VisitTest {

    @Test
    public void test_visit() throws Exception {
        DirectoryPart root = new DirectoryPart("root");
        FilePart log = new FilePart("log");
        DirectoryPart system = new DirectoryPart(root.getName() + "/system");
        FilePart java = new FilePart("java");
        FilePart apache = new FilePart("apache");

        system.add(java);
        system.add(apache);

        root.add(log);
        root.add(system);

        root.accept(new LinuxPathVisitor());
//        system.accept(new LinuxPathVisitor());
    }
}
