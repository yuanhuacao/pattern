package com.houbank.guava;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Guava {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        List<String> list=new ArrayList<>();

        Class t=list.getClass();
        Method method=t.getMethod("add", Object.class);
        System.out.println(method.getName());
        method.invoke(list,1);
        method.invoke(list,2);
        System.out.println(list.size());
        System.out.println(list);
        List<Integer> list2=new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.removeIf((x)->x%2==0);
        System.out.println(list2);


//        timer.


    }
}
