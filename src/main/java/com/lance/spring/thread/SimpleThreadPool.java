package com.lance.spring.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Dangdang on 2018/1/18.
 */
public class SimpleThreadPool {

    public static void executeTask() {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable task = new TaskThread("" + i);
            //将每个任务放到线程池, 放进去之后就会执行
            executorService.execute(task);
        }

        System.out.println("main before executeservice shutdown");

        //executorService.shutdown();
        try {
            executorService.awaitTermination(20, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //executorService.shutdown();
        System.out.println("main after executeservice shutdown");

        while (!executorService.isTerminated()) {

        }
        System.out.println("Finished all threads");
    }
}
