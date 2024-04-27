package com.akai;

import org.junit.jupiter.api.*;

import java.time.Duration;

@DisplayName("Junit5断言")
class Springboot06ApplicationTests5 {
    @BeforeEach
    public void pre() {
        System.out.println("Test Begin!");
    }
    @DisplayName("前置条件")
    @Test
    public void testAssumptions() {
        // 假设条件为 true的时候才会执行测试，否则取消测试
        Assumptions.assumeTrue(true);
        System.out.println("nice~");
    }
    @AfterEach
    public void pos() {
        System.out.println("Finish~");
    }
}
