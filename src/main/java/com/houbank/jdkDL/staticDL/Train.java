package com.houbank.jdkDL.staticDL;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Train implements Moveable {
    @Override
    public void move() {
        System.out.println("火车开动了。。。。。。狂吃狂吃。。。。");

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
