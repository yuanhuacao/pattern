package com.houbank.gson;

import com.google.gson.Gson;
import com.houbank.gson.entry.User;

/**
 * Created by Administrator on 2017/3/21.
 */
public class GsonUtil {

    public static void main(String[] args) {
//    baseOprate();
        objectOprate();
    }

    public static  void baseOprate(){
        Gson gson=new Gson();
        int i=gson.fromJson("100",int.class);
        boolean b=gson.fromJson("true",boolean.class);
        double d =gson.fromJson("\"99.99\"",double.class);
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(gson.toJson(100));
        System.out.println(gson.toJson(true));
    }

    public static  void objectOprate(){
        Gson gson=new Gson();

        User user=new User("小明",18,"2635@qq.com");
        System.out.println(gson.toJson(user));

        String json="{username:\"小明明\",age:18,email_address:\"qq@163.com\"}";
        User user1=gson.fromJson(json,User.class);
        System.out.println(user1);

        String json2="{username:\"小明明\",age:18,email:\"qq@163.com\"}";
        User user2=gson.fromJson(json2,User.class);
        System.out.println(user2);




    }
}


