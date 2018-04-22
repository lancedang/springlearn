package com.lance.spring.thread.example;

import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dangdang on 2018/1/21.
 */
public class MyExecuteDemo {
    public static void main(String[] args) throws InterruptedException {

        MyTaskThread taskThread = new MyTaskThread();

        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(6,
                10, 5, TimeUnit.MICROSECONDS, new SynchronousQueue<>());


        demonstrate(executor1);


    }

    public static void demonstrate(ThreadPoolExecutor executor) throws InterruptedException {
        MyTaskThread taskThread = new MyTaskThread();

        executor.execute(taskThread);
        executor.execute(taskThread);
        executor.execute(taskThread);
        executor.execute(taskThread);

        System.out.println("先提交4个任务");
        System.out.println("核心线程数 = " + executor.getCorePoolSize());
        System.out.println("当前线程池中线程数 = " + executor.getPoolSize());
        System.out.println("任务队列中任务数 = " + executor.getQueue().size());

        executor.execute(taskThread);
        executor.execute(taskThread);
        executor.execute(taskThread);

        System.out.println("再提交3个任务");
        System.out.println("核心线程数 = " + executor.getCorePoolSize());
        System.out.println("当前线程池中线程数 = " + executor.getPoolSize());
        System.out.println("任务队列中任务数 = " + executor.getQueue().size());

        Thread.sleep(8000);

        System.out.println("--8秒之后--");

        System.out.println("核心线程数 = " + executor.getCorePoolSize());
        System.out.println("当前线程池中线程数 = " + executor.getPoolSize());
        System.out.println("任务队列中任务数 = " + executor.getQueue().size());
    }

}
