package club.shengsheng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestDemoTest {

    @Test
    void testDemo() {
        assertEquals(4, new TestDemo().foo());
    }

}
