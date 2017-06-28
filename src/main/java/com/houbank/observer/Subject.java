package com.houbank.observer;

/**
 * Created by caoyuanhua on 2017/6/28.
 * 主题类
 */
public interface Subject {
    void  attach(Observer observer);
    void  dettach(Observer observer);
    void  notice(String str);

}
