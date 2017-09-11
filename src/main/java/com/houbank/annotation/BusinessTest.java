package com.houbank.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/19.
 */
@Service("fsf")
public class BusinessTest {


    public static void main(String[] args) {
        BusinessTest businessTest=new BusinessTest();
        businessTest.test();

        Class clazz=BusinessTest.class;
        Method [] methods=clazz.getMethods();
        for (Method m:methods
             ) {
            Annotation []annotations=m.getAnnotations();
            for (Annotation a :
                annotations) {
                System.out.println(a.annotationType());
                System.out.println(a.annotationType().getName());
                System.out.println(a.annotationType().getInterfaces());


            }

        }
    }


    @TODO
    public void test(){
        System.out.println("annotation..");
    }
}
