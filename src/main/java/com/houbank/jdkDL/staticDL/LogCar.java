package com.houbank.jdkDL.staticDL;

/**
 * Created by Administrator on 2017/7/3.
 */
public class LogCar implements Moveable {

    private  Moveable moveable;

    public LogCar(Moveable moveable) {
        this.moveable=moveable;
    }

    @Override
    public void move() {

        System.out.println("开始行车记录仪。。。。。。");
        moveable.move();
        System.out.println("关闭行车记录仪。。。。。。");
    }
}
