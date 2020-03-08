package com.ikang.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by gaoyouzhi on 2020/3/8.
 */
public class ThreadPoll {
    private static ExecutorService executorService = new ThreadPoolExecutor(100, 500, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    public static <T> List<T> addTask(List<Callable<T>> tasks) {
        List<Future<T>> futureList = null;
        List<T> results = null;
        try {
            futureList = executorService.invokeAll(tasks);
            results = new ArrayList<>();
            for (Future<T> future : futureList) {
                results.add(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return results;
    }
}
