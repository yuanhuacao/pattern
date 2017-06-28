package com.houbank.observer;

/**
 * Created by caoyuanhua on 2017/6/28.
 */
public class ObserverClient {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        weatherSubject.attach(new WeatherObserver("小明"));
        weatherSubject.attach(new WeatherObserver("小王"));
        weatherSubject.attach(new WeatherObserver("大熊"));
        weatherSubject.attach(new WeatherObserver("老王"));
        weatherSubject.notice("天气不孬!");
    }

}
