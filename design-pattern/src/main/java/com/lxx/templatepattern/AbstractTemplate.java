package com.lxx.templatepattern;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 * <p>
 * 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * @author lixiaoxiang
 */
public abstract class AbstractTemplate {

    /**
     * 算法骨架
     */
    public Result execute() {
        //第一步：解析参数
        parseRequestParameters();
        //第二步：校验参数
        checkRequestParameters();
        //第三步：业务处理
        Object data = doBusiness();
        //第四步：组织返回参数
        return assembleResponseParameters(data);
    }

    /**
     * 解析参数
     */
    public abstract void parseRequestParameters();

    /**
     * 校验参数
     */
    public abstract void checkRequestParameters();

    /**
     * 业务处理
     */
    public abstract Object doBusiness();

    /**
     * 组织返回参数
     */
    public abstract Result assembleResponseParameters(Object object);
}