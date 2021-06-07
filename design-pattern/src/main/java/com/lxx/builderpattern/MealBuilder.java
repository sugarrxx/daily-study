package com.lxx.builderpattern;

import com.lxx.builderpattern.goods.ChickenBurger;
import com.lxx.builderpattern.goods.Coke;
import com.lxx.builderpattern.goods.Pepsi;
import com.lxx.builderpattern.goods.VegBurger;

/**
 * @author lixiaoxiang
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}