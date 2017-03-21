package com.houbank.datastructure;

import java.time.LocalTime;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SimpleSf {

    public static void main(String[] args) {

        LocalTime localTime=LocalTime.now();
        double sum=0;
        for (double i = 1; i <=1000000000 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        LocalTime localTime1=LocalTime.now();
        System.out.println(localTime1.getNano()-localTime.getNano());
        LocalTime localTime2=LocalTime.now();
        double sum2=sumofN(1000000000);
        System.out.println(sum2);
        LocalTime localTime3=LocalTime.now();
        System.out.println(localTime3.getNano()-localTime2.getNano());


    }

    public static  double sumofN(double n){
        return (1+n)*n/2;
    }
    public static String  sumOfM(){
        return  "";
    }
}
