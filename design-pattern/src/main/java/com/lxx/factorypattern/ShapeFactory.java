package com.lxx.factorypattern;

import com.lxx.factorypattern.shape.Circle;
import com.lxx.factorypattern.shape.Rectangle;
import com.lxx.factorypattern.shape.Shape;
import com.lxx.factorypattern.shape.Square;

/**
 * @author lixiaoxiang
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     */
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
}