package com.lxx.strategypattern;

import com.lxx.strategypattern.strategy.OperationAdd;
import com.lxx.strategypattern.strategy.OperationMultiply;
import com.lxx.strategypattern.strategy.OperationSubtract;

/**
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * <p>
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * <url "title"=策略模式文章>https://juejin.cn/post/6970580861079011336</url>
 *
 * @author lixiaoxiang
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}