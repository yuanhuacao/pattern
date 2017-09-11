package com.houbank.spring;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/19.
 */
@Component
public class SpringBean {

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
            "name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            '}';
    }
}
