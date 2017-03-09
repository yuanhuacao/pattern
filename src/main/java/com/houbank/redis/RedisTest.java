package com.houbank.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by Administrator on 2017/3/9.
 */
public class RedisTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        RedisTemplate redisTemplate=(StringRedisTemplate)context.getBean("stringRedisTemplate");

        System.out.println(redisTemplate.getClientList());

        System.out.println(redisTemplate.opsForValue().get("foo"));


    }

}
