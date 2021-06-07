package com.lxx.builderpattern.goods;

import com.lxx.builderpattern.item.ColdDrink;

/**
 * @author lixiaoxiang
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}