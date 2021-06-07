package com.lxx.builderpattern.item;

import com.lxx.builderpattern.packing.Packing;

/**
 * @author lixiaoxiang
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}