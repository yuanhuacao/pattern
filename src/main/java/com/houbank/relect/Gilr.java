package com.houbank.relect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Gilr {
    private  String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gilr() {
    }

    public Gilr(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Class cls=Gilr.class;



        try {
         Constructor constructor=cls.getConstructor(String.class,Integer.class);
         Gilr gilr= (Gilr) constructor.newInstance("aa",15);
         System.out.println(gilr.getName());




        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}


