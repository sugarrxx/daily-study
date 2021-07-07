package com.lxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

/**
 * @Author lixiaoxiang
 */
@SpringBootTest(classes = {Starter.class})
@RunWith(SpringRunner.class)
public class StarterTest {

    @Test
    public void doTest() {

        List<String> list = new ArrayList<>();

        String s = list.stream().map(String::toString).collect(Collectors.joining(","));
        System.out.println(s);
    }

    @Test
    public void test() {

       String mobile = "13812344321";
        System.out.println(mobile.length());
    }

}
