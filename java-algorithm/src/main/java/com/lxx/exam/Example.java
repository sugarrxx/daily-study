package com.lxx.exam;

import java.util.Scanner;

/**
 * 有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？（输出第 10 个月的兔子对数）
 * <p>
 * 其实这就是个典型的斐波拉契数列问题：
 * 第 1 个月：1 对兔子
 * 第 2 个月：1 对兔子
 * 第 3 个月：2 对兔子
 * 第 4 个月：3 对兔子
 * ……
 * 即从第 3 个月开始，当前月的兔子对数是当前月前两个月的兔子对数之和。
 *
 * @Author lixiaoxiang
 * @Date 2021/6/8
 */
public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        System.out.println("输入月份");
        month = scanner.nextInt();

        int former = 1;
        int latter = 1;
        for (int i = 1; i <= month; i++) {
//            第 1、2 个月的情况
            if (i < 3) {
                latter = 1;
            } else {
                int tmp = latter;
                latter += former;
                former = tmp;
            }
            System.out.format("第 %d 个月的兔子对数：%d\n", i, latter);
        }
    }
}
