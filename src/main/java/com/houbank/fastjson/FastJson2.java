package com.houbank.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by caoyuanhua on 2017/7/14.
 */
public class FastJson2 {

    public static void main(String[] args) {
        User tom = new User();
        tom.setName("tom");
        List hobby=new ArrayList();
        hobby.add("football");
        hobby.add("basketball");
        hobby.add("reading");
        tom.setHobby(hobby);

        JSONObject jsonObject=(JSONObject) JSON.toJSON(tom);
        User user=JSON.toJavaObject(jsonObject,User.class);
        System.out.println("user:"+user.toString());

    }
}
