package club.shengsheng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestDemoTest {

    @Test
    void testDemo() {
        System.out.println(new TestDemo().foo());
        assertEquals(1, new TestDemo().foo());
    }

    @Test
    void testAdd(){
         System.out.println(new TestDemo().foo());
          assertEquals(11, new TestDemo().foo());
    }

}
