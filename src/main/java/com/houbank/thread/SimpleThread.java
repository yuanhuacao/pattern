package com.houbank.thread;

/**
 * Created by Administrator on 2017/3/9.
 */
public class SimpleThread extends  Thread {
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程是把双刃剑000");
            }
        });
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程是把双刃剑111");
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程是把双刃剑2222");
            }
        });
        t.start();
        t1.start();
        t2.start();
    }
}
