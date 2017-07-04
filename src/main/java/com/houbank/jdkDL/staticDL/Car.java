package com.houbank.jdkDL.staticDL;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Car implements Moveable {
    @Override
    public void move()  {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("汽车发动了。。。。。。。。");
    }
}
