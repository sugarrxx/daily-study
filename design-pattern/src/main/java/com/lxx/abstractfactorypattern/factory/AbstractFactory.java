package com.lxx.abstractfactorypattern.factory;

import com.lxx.abstractfactorypattern.color.Color;
import com.lxx.abstractfactorypattern.shape.Shape;

/**
 * @author lixiaoxiang
 */
public abstract class AbstractFactory {

    /**
     * getColor
     *
     * @param color color
     * @return Color
     */
    public abstract Color getColor(String color);

    /**
     * getShape
     *
     * @param shape shape
     * @return Shape
     */
    public abstract Shape getShape(String shape);
}