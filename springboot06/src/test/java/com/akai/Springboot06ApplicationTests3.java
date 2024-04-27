package com.akai;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.TimeUnit;
// @SpringBootTest，等价于下面两个注解
// @BootstrapWith(SpringBootTestContextBootstrapper.class)
// @ExtendWith({SpringExtension.class})
@DisplayName("Junit5注解测试")  // @DisplayName给测试起别名，也可加在方法上
class Springboot06ApplicationTests3 {
    @BeforeEach  // 相当于 @Before
    public void pre() {
        System.out.println("Test Begin!");
    }
    @RepeatedTest(3) // 重复测试3次
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)  // 超时：1000毫秒，unit = TimeUnit.MILLISECONDS指定了单位
    // @Test // 有 @RepeatedTest就不用加 @Test
    public void test01() throws InterruptedException {
        System.out.println("shiho~");
        Thread.sleep(1001); // test01() timed out after 1000 milliseconds
        // 如果超时，直接报错
    }
    @AfterEach  // 相当于 @After
    public void pos() {
        System.out.println("Finish~");
    }
}
