package com.lxx.observerpattern.observer;

import com.lxx.observerpattern.Subject;

/**
 * @author lixiaoxiang
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
