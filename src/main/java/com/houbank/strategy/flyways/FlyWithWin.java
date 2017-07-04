package com.houbank.strategy.flyways;

import com.houbank.strategy.FlyStrategy;

/**
 * Created by caoyuanhua on 2017/6/30.
 * 用翅膀飞行
 */
public class FlyWithWin  implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("振翅高飞");
    }
}
