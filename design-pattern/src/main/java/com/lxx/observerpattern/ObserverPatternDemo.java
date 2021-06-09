package com.lxx.observerpattern;

import com.lxx.observerpattern.observer.FriendOneObserver;
import com.lxx.observerpattern.observer.FriendTwoObserver;
import com.lxx.observerpattern.subject.ConcreteSubject;

/**
 * 观察者模式
 * <p>
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 *
 * @author lixiaoxiang
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        // 这里假设是添加好友
        subject.attach(new FriendOneObserver());
        FriendTwoObserver twoObserver = new FriendTwoObserver();
        subject.attach(twoObserver);

        // 发送朋友圈动态
        subject.notifyObservers("第一个朋友圈消息");
        // 输出结果： FriendOne 知道了你发动态了第一个朋友圈消息
        //          FriendTwo 知道了你发动态了第一个朋友圈消息

        // 这里发现 twoObserver 是个推荐卖茶叶的，删除好友
        subject.detach(twoObserver);
        subject.notifyObservers("第二个朋友圈消息");
        // 输出结果：FriendOne 知道了你发动态了第二个朋友圈消息
    }
}