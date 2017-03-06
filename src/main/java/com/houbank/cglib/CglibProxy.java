package com.houbank.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/25.
 */
public class CglibProxy implements MethodInterceptor {

    public Object getProxy(Class clazz){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        Object reultObject=enhancer.create();
        return reultObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("小王要买车");
        Object reult=    methodProxy.invokeSuper(o,objects);
        System.out.println("好好学习，天天向上，思密达！！！");
        return reult;
    }
}
