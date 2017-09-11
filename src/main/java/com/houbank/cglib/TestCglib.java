package com.houbank.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/2/25.
 */
public class TestCglib {


    private  final  static Logger logger= LoggerFactory.getLogger(TestCglib.class);
    public static void main(String[] args) {
        CivicCar civicCar=new CivicCar();
        CglibProxy cglibProxy=new CglibProxy();
        CivicCar civicCar1=(CivicCar) cglibProxy.getProxy(civicCar.getClass());
        civicCar1.say();
        logger.debug("这是一个degbug{},{}","dd","cc","dd");


    }
}
