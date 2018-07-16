package com.lance.spring.thread.executorthreadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {

    }

    public void testExecutorThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.MINUTES, new LinkedBlockingQueue<>(5));
    }

}
