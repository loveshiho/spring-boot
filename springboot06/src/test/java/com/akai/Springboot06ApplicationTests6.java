package com.akai;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Junit5参数化测试")
class Springboot06ApplicationTests6 {
    @BeforeEach
    public void pre() {
        System.out.println("Test Begin!");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testParam1(int a) {
        Assertions.assertTrue(a > 0 && a < 4);
    }
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testParam2(String str) {
        Assertions.assertNotNull(str);
    }
    public static Stream<String> stringProvider() {
        List<String> list = new ArrayList<>();
        list.add("shiho");
        list.add("loveshiho");
        list.add(null);
        Stream<String> stream = list.stream();
        return stream;
    }
    @AfterEach
    public void pos() {
        System.out.println("Finish~");
    }
}
