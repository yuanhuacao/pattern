package com.houbank.strategy.ducks;

import com.houbank.strategy.Duck;
import com.houbank.strategy.flyways.FlyNoWay;

/**
 * Created by caoyuanhua on 2017/6/30.
 */
public class YellowDuck extends Duck {

    @Override
    public void display() {
        System.out.println("我是一只大黄鸭");
    }

    public YellowDuck() {
        super.setFlyStrategy(new FlyNoWay());
    }
    @Override
    public void moo(){
        System.out.println("木啊木啊木啊");
    }
}
