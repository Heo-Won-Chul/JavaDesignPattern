package test.memento;

import com.tistory.heowc.mememto.Editor;
import com.tistory.heowc.mememto.History;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MementoTest {

    private static History HISTORY;
    private static Editor EDITOR;

    @BeforeClass
    public static void beforeClass_init() {
        HISTORY = new History();
        EDITOR = new Editor();
    }

    @Test
    public void test1_applyTextContent() {
        HISTORY.apply(EDITOR.writeToTextContent("1 : Hello,"));
    }

    @Test
    public void test2_undoTextContent() {
        HISTORY.undo();
    }

    @Test
    public void test3_applyTextContent() {
        HISTORY.apply(EDITOR.writeToTextContent("2 : My name is wonchul Heo."));
    }

    @Test
    public void test4_applyTextContent() {
        HISTORY.apply(EDITOR.writeToTextContent("3 : My job is Developer."));
    }
}
