package com.houbank.jdkDL;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by caoyuanhua on 2017/2/25.
 */
public class TestJdk {

    public void test(){
        QRCar qrCar=new QRCar();
        String a="";


    }





    public static void main(String[] args) {

         System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
         InvocationHandler h=new TimeInvocation(new JLCar());
         Car car=(Car) Proxy.newProxyInstance(Car.class.getClassLoader(),JLCar.class.getInterfaces(),h);
         car.move();




    }


}
