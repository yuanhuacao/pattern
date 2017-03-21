package com.houbank.gson.entry;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/3/21.
 */
public class User {
    private String username;
    private  Integer age;
    @SerializedName(value = "email_address",alternate={"emailAddress","email"})
    private  String emailAddress;


    public User(String username, Integer age, String emailAddress) {
        this.username = username;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
            "username='" + username + '\'' +
            ", age=" + age +
            ", emailAddress='" + emailAddress + '\'' +
            '}';
    }
}
