package com.lxx.observerpattern.subject;

import com.lxx.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaoxiang
 */
public interface Subject {

    // 添加订阅关系
    void attach(Observer observer);
    // 移除订阅关系
    void detach(Observer observer);
    // 通知订阅者
    void notifyObservers(String message);
}