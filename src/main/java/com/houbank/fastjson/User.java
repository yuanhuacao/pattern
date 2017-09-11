package com.houbank.fastjson;



import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by caoyuanhua on 2017/6/30.
 */
public class User {

    private  String name;

    private List<String> hobby;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "User{" +
            "name='" + name + '\'' +
            ", hobby=" + hobby +
            ", age=" + age +
            '}';
    }
}
