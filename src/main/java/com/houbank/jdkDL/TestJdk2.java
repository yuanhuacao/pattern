package com.houbank.jdkDL;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/7/3.
 */
public class TestJdk2 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1. 生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //2. 获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(Car.class.getClassLoader(),Car.class);
        //3. 获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        //4. 通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        Car  car = (Car) constructor.newInstance(new TimeInvocation(new JLCar()));
        //5. 通过代理对象调用目标方法
        car.move();
    }
}
