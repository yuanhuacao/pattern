package com.houbank.jdkDL.staticDL;

/**
 * Created by caoyuanhua on 2017/7/3.
 */
public class TimeCar implements Moveable {

    private Moveable moveable;

    public TimeCar(Moveable moveable) {
        this.moveable=moveable;
    }


    @Override
    public void move() {
        System.out.println("开始记录时间");
        Long start = System.currentTimeMillis();
        moveable.move();
        System.out.println("行驶时间结束，共用时:" + (System.currentTimeMillis() - start));
    }
}
