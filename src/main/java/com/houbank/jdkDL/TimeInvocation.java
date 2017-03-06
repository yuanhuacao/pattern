package com.houbank.jdkDL;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/25.
 */
public class TimeInvocation implements InvocationHandler {
    private  Object target;

    public TimeInvocation(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车来了，呜呜呜呜。。。。");
            method.invoke(target,args);
        System.out.println("汽车开走了，嘻嘻嘻~~~~");

        return null;
    }
}
