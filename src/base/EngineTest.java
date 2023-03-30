package base;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @org.junit.jupiter.api.Test
    void doSomething() {
        Engine e = new Engine();

        String s = e.doSomething(1, 1);

        assertEquals("111", s);

    }




}