package com.lance.spring.thread.executorthreadpool;

public class TaskThread implements Runnable {

    @Override
    public void run() {
        try {
            doSth();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doSth() throws InterruptedException {
        Thread.sleep(1000 * 3);
    }
}
