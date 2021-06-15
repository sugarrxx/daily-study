package com.lxx.util;

/**
 * @Author lixiaoxiang
 * @Date 2021/6/11
 */
public class LittleTips {

    /**
     * 生成随机六位数, %06d 这个写法第一次见
     *
     * @return random
     */
    public String randomSix() {
        String format = String.format("%06d", Double.valueOf(Math.random() * 1000000).intValue());
        System.out.println(format);
        return format;
    }
}
