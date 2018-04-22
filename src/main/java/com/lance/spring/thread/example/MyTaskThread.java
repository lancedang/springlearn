package com.lance.spring.thread.example;

/**
 * Created by Dangdang on 2018/1/21.
 */
public class MyTaskThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
