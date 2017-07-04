package com.houbank.strategy.flyways;

import com.houbank.strategy.FlyStrategy;

/**
 * Created by Administrator on 2017/6/30.
 */
public class FlyWithRoket implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("在太空遨游");
    }
}
