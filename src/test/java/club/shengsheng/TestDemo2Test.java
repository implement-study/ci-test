package club.shengsheng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDemo2Test {

    @Test
    void bar() {
        assertEquals("bar", new TestDemo2().bar());
    }
}
