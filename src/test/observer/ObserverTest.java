package test.observer;

import com.tistory.heowc.observer.SBSBroadcast;
import com.tistory.heowc.observer.SBSViewer;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObserverTest {

    private static SBSBroadcast SBS;

    @BeforeClass
    public static void beforeClass_init() {
        SBS = new SBSBroadcast();
        SBS.addViewer(new SBSViewer("Heo Won Chul"));
        SBS.addViewer(new SBSViewer("Jeon Na Eun"));
        SBS.addViewer(new SBSViewer("Hong Gil Dong"));
    }

    @Test
    public void test_1send() {
        SBS.send("Seoul Broadcast System");
    }

    @Test
    public void test_2delete() {
        SBS.removeViewer(new SBSViewer("Hong Gil Dong"));
    }

    @Test
    public void test_3send2() {
        SBS.send("서울 방송 시스템");
    }

}
