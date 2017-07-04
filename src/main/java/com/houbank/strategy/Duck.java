package com.houbank.strategy;

/**
 * Created by caoyuanhua on 2017/6/30.
 */
public abstract class Duck {

    private FlyStrategy flyStrategy;

    public abstract  void display();

    public void moo() {
        System.out.println("嘎嘎嘎");
    }

    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public  void  fly(){
        flyStrategy.fly();
    }
}
