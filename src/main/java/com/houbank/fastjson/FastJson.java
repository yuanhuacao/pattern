package com.houbank.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.houbank.gson.entry.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by caoyuanhua on 2017/6/30.
 */
public class FastJson {

    public static void main(String[] args) {

        User tom = new User();
        tom.setAge(18);
        tom.setName("tom");
        List hobby=new ArrayList();
        hobby.add("football");
        hobby.add("basketball");
        hobby.add("reading");
        tom.setHobby(hobby);

//        JSONObject jsonObject=(JSONObject) JSON.toJSON(tom);
//        System.out.println( jsonObject.get("name"));
//        System.out.println( jsonObject.toJSONString());
//        System.out.println(JSON.toJavaObject(jsonObject, User.class).toString());



//        FastJson fastJson=new FastJson();
//        fastJson.relect();
//        Map<String,Object> map=new HashMap();
//        map.put("aa",1);
//        map.put("user",tom);
        List list=new ArrayList();
        list.add(1);
        list.add(tom);
        System.out.println(JSON.toJSON(list));


        JSONArray jsonArray=new JSONArray(1);
        jsonArray.add(1);
        jsonArray.add(2);





        JSONObject jsonObject=(JSONObject) JSON.toJSON(tom);

        User user=JSON.toJavaObject(jsonObject,User.class);
        System.out.println("user:"+user.toString());
        JSONArray jsonArray1=(JSONArray) jsonObject.get("hobby");



        jsonArray1.get(0);


        System.out.println( hobby  instanceof   Collection);




    }

    public void relect(){
        Class clazz=User.class;
        Field field[]=clazz.getDeclaredFields();// 生命的变量
        for (Field field1:field){
            System.out.println("成员变量："+field1.getName());
        }
        Method[] method=clazz.getDeclaredMethods();
        for (Method method1:method){
            System.out.println("成员方法："+method1.getName());
            AnnotatedType annotatedType=method1.getAnnotatedReturnType();
            System.out.println("方法返回值类型:"+annotatedType.getType().getTypeName());
        }

    }


}
