package com.lxx.builderpattern.goods;

import com.lxx.builderpattern.item.ColdDrink;

/**
 * @author lixiaoxiang
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}