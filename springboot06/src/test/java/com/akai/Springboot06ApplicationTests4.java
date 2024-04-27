package com.akai;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@DisplayName("Junit5断言")
class Springboot06ApplicationTests4 {
    @BeforeEach
    public void pre() {
        System.out.println("Test Begin!");
    }

    @DisplayName("简单断言1")
    @Test
    public void testAssertions1() {
        int x = add(1, 2);
        Assertions.assertEquals(3, x, "Fucking Fucked!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    @DisplayName("简单断言2")
    @Test
    public void testAssertions2() {
        String s1 = "aaa";
        String s2 = new String("aaa");
        Assertions.assertSame(s1, s2);
    }

    @DisplayName("组合断言")
    @Test
    public void testAssertAll() {
        Assertions.assertAll("AssertAll",
                () -> Assertions.assertTrue(1 > 0),
                () -> Assertions.assertTrue(2 > 3));
    }

    @Test
    @DisplayName("异常断言")    // 断言它会出现指定的异常，如果没出现，则表示测试失败
    public void testAssertException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int i = 1 / 0;
        });
    }

    @Test
    @DisplayName("超时断言")
    public void testAssertTimeOut() {
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(5000));
    }

    // 快速失败
    @DisplayName("快速失败")    // 如果测试时出现了某些情况，直接生成测试失败的报告，后续也不再测试了
    @Test
    public void testFail() {
        if (true) {
            Assertions.fail("测试失败");
        }
    }

    @AfterEach
    public void pos() {
        System.out.println("Finish~");
    }
}
