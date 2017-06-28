package com.houbank.observer;

/**
 * Created by caoyuanhua on 2017/6/28.
 */
public class WeatherObserver implements  Observer{

    private String name;
    public WeatherObserver(String name ) {
        this.name=name;
    }

    @Override
    public void notice(String str) {
        System.out.println(name+"说: "+str);
    }
}
