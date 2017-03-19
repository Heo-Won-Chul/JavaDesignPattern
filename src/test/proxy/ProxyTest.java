package test.proxy;

import com.tistory.heowc.proxy.ProxyImage;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test_proxy() {
        ProxyImage proxyImage = new ProxyImage("proxyTest");
        proxyImage.displayImage();
    }
}
