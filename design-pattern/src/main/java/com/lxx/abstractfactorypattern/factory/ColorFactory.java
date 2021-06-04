package com.lxx.abstractfactorypattern.factory;

import com.lxx.abstractfactorypattern.color.Blue;
import com.lxx.abstractfactorypattern.color.Color;
import com.lxx.abstractfactorypattern.color.Green;
import com.lxx.abstractfactorypattern.color.Red;
import com.lxx.abstractfactorypattern.shape.Shape;

/**
 * @author lixiaoxiang
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}