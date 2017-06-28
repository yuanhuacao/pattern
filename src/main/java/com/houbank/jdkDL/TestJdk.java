package com.houbank.jdkDL;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by caoyuanhua on 2017/2/25.
 */
public class TestJdk {


    static  QRCar qrCar=new QRCar();
    static JLCar jlCar=new JLCar();
    static  InvocationHandler h=new TimeInvocation(qrCar);
    static  InvocationHandler h2=new TimeInvocation(jlCar);



    public static void main(String[] args) {
        Car car=(Car) Proxy.newProxyInstance(QRCar.class.getClassLoader(),qrCar.getClass().getInterfaces(),h);
        car.move();
        Car car2=(Car) Proxy.newProxyInstance(JLCar.class.getClassLoader(),jlCar.getClass().getInterfaces(),h2);
        car2.move();

    }


}
