package com.lxx.singleton;

/**
 * 双端校验,线程安全,要会手写
 * double-checked locking
 *
 * @Author lixiaoxiang
 */
public class Singleton {

    public volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    /**
     * 懒汉式
     * public class Singleton {
     *     private static Singleton instance;
     *     private Singleton (){}
     *
     *     public static Singleton getInstance() {
     *     if (instance == null) {
     *         instance = new Singleton();
     *     }
     *     return instance;
     *     }
     * }
     */


    /**
     * 饿汉式
     * public class Singleton {
     *     private static Singleton instance = new Singleton();
     *     private Singleton (){}
     *     public static Singleton getInstance() {
     *     return instance;
     *     }
     * }
     */
}
