package com.lxx.util;

/**
 * 代码耗时统计
 *
 * @Author lixiaoxiang
 */
public class TimeUse {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            // .... 具体的代码段
        } finally {
            System.out.println("cost: " + (System.currentTimeMillis() - start));
        }
    }
}
