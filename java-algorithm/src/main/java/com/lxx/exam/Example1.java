package com.lxx.exam;

/**
 * 判断 100 - 200 之间的素数的个数并输出
 * <p>
 * 判断一个数是否为素数，只要用这个数分别取除 2 ~ sqrt(这个数)，一旦被整除，则表明这个数不是素数，否则就是素数。
 *
 * @Author lixiaoxiang
 * @Date 2021/6/8
 */
public class Example1 {

    public static void main(String[] args) {
//        素数个数
        int count = 0;
        System.out.println("100 ~ 200 之间的素数：");
        for (int i = 100; i <= 200; i++) {
//            默认非素数
            boolean isPrime = false;
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
//                一旦能除尽，则说明不是素数，直接跳出循环
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
//            如果是素数，则素数个数 + 1，然后打印出该素数
            if (!isPrime) {
                count++;
                System.out.print(i + "\t");
//                每行打印 5 个素数，
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n素数总个数：" + count);
    }
}
