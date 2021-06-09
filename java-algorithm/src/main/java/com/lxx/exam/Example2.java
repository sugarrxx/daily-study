package com.lxx.exam;

/**
 * 打印出所有“水仙花数”，所谓水仙花数，是指有一个三位数，其各个数字的立方和等于其本身，
 * 例如：153=1*1*1+5*5*5+3*3*3 所以 153 是水仙花数
 * <p>
 * 因为水仙花数是一个三位数，所以它的范围是 100 ~ 999，然后分别求出这个三位数的个位、十位、百位，最后判断他们各自立方的和是否等于该三位数即可。
 *
 * @Author lixiaoxiang
 * @Date 2021/6/8
 */
public class Example2 {

    public static void main(String[] args) {
        System.out.println("水仙花数：");
        for (int i = 100; i < 1000; i++) {
//            个位
            int one = i % 10;
//            十位
            int ten = i % 100 / 10;
//            百位
            int hundred = i / 100;
//            计数
            int count = 0;
            if (one * one * one + ten * ten * ten + hundred * hundred * hundred == i) {
                count++;
//                打印水仙花数，每 5 个换行输出
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
