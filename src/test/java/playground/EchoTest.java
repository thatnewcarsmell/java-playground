package playground;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EchoTest {

    @Test
    public void testShoutReturnsUpperCase() {
        Echo echo = new Echo();

        String result = echo.shout("hello");

        assertEquals("HELLO!", result);
    }
}
