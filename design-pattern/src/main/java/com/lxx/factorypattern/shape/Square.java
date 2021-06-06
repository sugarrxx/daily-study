package com.lxx.factorypattern.shape;

/**
 * @author lixiaoxiang
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}