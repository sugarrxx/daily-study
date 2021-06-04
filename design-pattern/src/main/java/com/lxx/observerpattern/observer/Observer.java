package com.lxx.observerpattern.observer;

import com.lxx.observerpattern.Subject;

/**
 * @author lixiaoxiang
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * update
     */
    public abstract void update();
}