package com.haochang.demo;

import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: 描述：线程池
 * @author: youzhi.gao
 * @date: 2020-11-04 10:18
 */
public class RmsThreadPool {
    public static final ThreadPoolExecutor threads =
            new ThreadPoolExecutor(4,
                               8,
                                  60,
                                    TimeUnit.SECONDS,
                                    new ArrayBlockingQueue<>(10),
                                    new DefaultThreadFactory("rms工厂"),
                                    new ThreadPoolExecutor.AbortPolicy());
}
