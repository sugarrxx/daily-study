package com.lxx.builderpattern.item;

import com.lxx.builderpattern.packing.Packing;
import com.lxx.builderpattern.packing.Wrapper;

/**
 * @author lixiaoxiang
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}