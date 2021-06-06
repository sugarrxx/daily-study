package com.lxx.abstractfactorypattern.factory;

import com.lxx.abstractfactorypattern.color.Color;
import com.lxx.abstractfactorypattern.shape.Circle;
import com.lxx.abstractfactorypattern.shape.Rectangle;
import com.lxx.abstractfactorypattern.shape.Shape;
import com.lxx.abstractfactorypattern.shape.Square;

/**
 * @author lixiaoxiang
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}