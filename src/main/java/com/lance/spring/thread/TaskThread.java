package com.lance.spring.thread;

/**
 * Created by Dangdang on 2018/1/18.
 */
public class TaskThread implements Runnable {

    private String command;

    public TaskThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", Start " + command);
        //执行某种具体任务
        processCommand();
        System.out.println(Thread.currentThread().getName() + ", End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
