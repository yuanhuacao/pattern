package com.houbank.strategy.ducks;

import com.houbank.strategy.Duck;
import com.houbank.strategy.flyways.FlyWithWin;

/**
 * Created by Administrator on 2017/6/30.
 */
public class GreenNeckDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我的脖子绿绿的");
    }

    public GreenNeckDuck() {
        super.setFlyStrategy(new FlyWithWin());
    }
}
