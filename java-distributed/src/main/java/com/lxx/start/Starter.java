package com.lxx.start;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 为什么需要锁
 *
 * @author lixiaoxiang
 */
public class Starter {

    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet();
        // 仅做示范, 不能使用Executors创建线程池(详见线程笔记)
        @SuppressWarnings({})
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            final int storeNumber = i;
            es.execute(() -> {
                User user = new User(cabinet, storeNumber);
                user.useCabinet();
                System.out.println("我是用户" + storeNumber + ",我存储的数字是：" + cabinet.getStoreNumber());
            });
        }
        es.shutdown();
        /*
         * 输出
         * 我是用户2,我存储的数字是：2
         * 我是用户0,我存储的数字是：2
         * 我是用户1,我存储的数字是：2
         * 再一次
         * 我是用户1,我存储的数字是：2
         * 我是用户0,我存储的数字是：0
         * 我是用户2,我存储的数字是：2
         */
    }
}