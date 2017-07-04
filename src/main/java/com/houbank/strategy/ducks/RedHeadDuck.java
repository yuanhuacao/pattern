package com.houbank.strategy.ducks;

import com.houbank.strategy.Duck;
import com.houbank.strategy.flyways.FlyWithWin;

/**
 * Created by Administrator on 2017/6/30.
 */
public class RedHeadDuck extends  Duck {
    @Override
    public void display() {
        System.out.println("我是一只红头鸭");
    }

    public RedHeadDuck() {
        super.setFlyStrategy(new FlyWithWin());
    }
}
