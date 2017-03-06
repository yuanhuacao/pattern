package com.houbank.constants.new8;

/**
 * Created by Administrator on 2017/2/23.
 */
public class TestInterface {

    public static void main(String[] args) {
        Defaultable defaultable=new DefaultableImpl();
        String s=defaultable.sysHi();

        System.out.println(s);
    }
}
