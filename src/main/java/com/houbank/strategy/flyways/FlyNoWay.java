package com.houbank.strategy.flyways;

import com.houbank.strategy.FlyStrategy;

/**
 * Created by Administrator on 2017/6/30.
 */
public class FlyNoWay implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("俺不会飞行，嘻嘻");
    }
}
