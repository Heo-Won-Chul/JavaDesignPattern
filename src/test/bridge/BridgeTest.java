package test.bridge;

import com.tistory.heowc.bridge.color.BlueColor;
import com.tistory.heowc.bridge.color.RedColor;
import com.tistory.heowc.bridge.tool.Pen;
import com.tistory.heowc.bridge.tool.Pencil;
import com.tistory.heowc.bridge.tool.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BridgeTest {

    Tool redPencil;
    Tool bluePen;

    @Before
    public void before_init() {
        redPencil = new Pencil(new RedColor());
        bluePen = new Pen(new BlueColor());
    }

    @Test
    public void test_pencil() {
        assertEquals(redPencil.write(), "빨간색 연필");
    }

    @Test
    public void test_pen() {
        assertEquals(bluePen.write(), "파란색 볼펜");
    }
}
