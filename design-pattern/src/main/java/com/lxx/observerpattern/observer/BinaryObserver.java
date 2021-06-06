package com.lxx.observerpattern.observer;

import com.lxx.observerpattern.Subject;

/**
 * @author lixiaoxiang
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}