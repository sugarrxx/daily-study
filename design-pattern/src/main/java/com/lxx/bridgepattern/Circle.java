package com.lxx.bridgepattern;

/**
 * @author lixiaoxiang
 */
public class Circle extends Shape {

    private final int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}