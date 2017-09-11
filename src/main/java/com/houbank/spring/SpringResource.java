package com.houbank.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoyuanhua on 2017/7/19.
 * spring 源码
 */
public class SpringResource {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        SpringBean springBean=(SpringBean) applicationContext.getBean("springBean");
        System.out.println(springBean);

    }
}
