package com.lxx.builderpattern.item;

import com.lxx.builderpattern.packing.Bottle;
import com.lxx.builderpattern.packing.Packing;

/**
 * @author lixiaoxiang
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}