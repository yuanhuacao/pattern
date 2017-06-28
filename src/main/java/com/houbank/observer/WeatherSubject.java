package com.houbank.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyuanhua on 2017/6/28.
 */
public class WeatherSubject implements Subject {



    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice(String str) {
        for (Observer o : observers
            ) {
            o.notice(str);
        }

    }



    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
