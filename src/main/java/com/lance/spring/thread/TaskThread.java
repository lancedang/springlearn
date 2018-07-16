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
        //执行某种具体任务, 抽象出单独方法用以解耦具体逻辑
        processCommand();
        System.out.println(Thread.currentThread().getName() + ", End.");
    }

    //具体的任务执行动作
    private void processCommand() {
        try {
            //用 sleep 代替具体执行的过程
            Thread.sleep(5000 * 4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
