package com.ikang.demo;

import java.util.concurrent.*;

/**
 * futureTask测试
 * @author gaoyouzhi
 * @date 2020/3/7
 */
public class FutureTaskDemo {

    public static void main(String[] args) {

        ExecutorService executorService = new ThreadPoolExecutor(4, 4, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10));


    }
}
