package com.houbank.strategy.ducks;

import com.houbank.strategy.Duck;
import com.houbank.strategy.flyways.FlyWithRoket;

/**
 * Created by Administrator on 2017/6/30.
 */
public class RoketDuck extends  Duck {
    @Override
    public void display() {
        System.out.println("我是一只太空鸭");
    }
    @Override
    public void moo(){
        System.out.println("滴答滴答");
    }

    public RoketDuck() {
        super.setFlyStrategy(new FlyWithRoket());
    }
}
