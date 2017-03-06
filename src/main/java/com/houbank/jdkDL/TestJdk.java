package com.houbank.jdkDL;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/25.
 */
public class TestJdk {


    static  QRCar qrCar=new QRCar();
    static  InvocationHandler h=new TimeInvocation(qrCar);


    public static void main(String[] args) {
        Car car=(Car) Proxy.newProxyInstance(QRCar.class.getClassLoader(),qrCar.getClass().getInterfaces(),h);
        car.move();
    }


}
