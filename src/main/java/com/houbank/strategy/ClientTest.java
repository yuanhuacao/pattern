package com.houbank.strategy;

import com.houbank.strategy.ducks.*;

/**
 * Created by caoyuanhua on 2017/6/30.
 */
public class ClientTest {

    public static void main(String[] args) {

        Duck duck = null;
        //        duck= new GreenNeckDuck();
//        duck = new RedHeadDuck();
//        duck=new RoketDuck();
        duck=new YellowDuck();
        System.out.println("--------------------------------");
        duck.display();
        duck.moo();
        duck.fly();
        System.out.println("--------------------------------");

    }
}
