package com.lxx.abstractfactorypattern;

import com.lxx.abstractfactorypattern.factory.AbstractFactory;
import com.lxx.abstractfactorypattern.factory.ColorFactory;
import com.lxx.abstractfactorypattern.factory.ShapeFactory;

/**
 * @author lixiaoxiang
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}