package com.lxx;

import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author lixiaoxiang
 */
@SpringBootTest(classes = {Starter.class})
@RunWith(SpringRunner.class)
public class StarterTest {

    @Test
    public void doTest() {

    }

    @Test
    public void test() {
        // new ArrayList 和 Arrays.asList 生成的List 不同
//        List<Integer> list = Arrays.asList(1, 4, 5, 7, 89, 87, 43);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(89);
        list.add(87);
        list.add(43);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();

            if (next % 2 == 0) {
                iterator.remove();

            }

            if (next == 89) {
                iterator.remove();
            }
            next = next + 100;
        }

        System.out.println(list);
    }

}
