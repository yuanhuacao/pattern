package com.houbank.jdkDL.staticDL;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Client {

    public static void main(String[] args) {
        Train train=new Train();
        LogCar logCar=new LogCar(train);
        TimeCar timeCar=new TimeCar(logCar);
        timeCar.move();
    }
}


