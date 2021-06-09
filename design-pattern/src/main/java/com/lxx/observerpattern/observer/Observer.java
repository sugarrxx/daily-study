package com.lxx.observerpattern.observer;


/**
 * @author lixiaoxiang
 */
public interface Observer {
    // 处理业务逻辑
    void update(String message);
}