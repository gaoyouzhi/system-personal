package com.ikang.executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class VisableThreadPoolExecutor extends ThreadPoolTaskExecutor {

    private static final Log log = LogFactory.getLog(VisableThreadPoolExecutor.class);

    private void showThreadPoolInfo(String prefix){
        ThreadPoolExecutor threadPoolExecutor = getThreadPoolExecutor();

        if(null==threadPoolExecutor){
            return;
        }

        log.info(this.getThreadNamePrefix() + prefix +
                "taskCount[" + threadPoolExecutor.getTaskCount() +"]"+
                "completedTaskCount [" + threadPoolExecutor.getCompletedTaskCount() + "]" +
                "activeCount [" + threadPoolExecutor.getActiveCount() + "]" +
                "queueSize [" + threadPoolExecutor.getQueue().size()  + "]");
    }

    @Override
    public void execute(Runnable task) {
        showThreadPoolInfo("1. do execute");
        super.execute(task);
    }

    @Override
    public void execute(Runnable task, long startTimeout) {
        showThreadPoolInfo("2. do execute");
        super.execute(task, startTimeout);
    }

    @Override
    public Future<?> submit(Runnable task) {
        showThreadPoolInfo("1. do submit");
        return super.submit(task);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        showThreadPoolInfo("2. do submit");
        return super.submit(task);
    }

    @Override
    public ListenableFuture<?> submitListenable(Runnable task) {
        showThreadPoolInfo("1. do submitListenable");
        return super.submitListenable(task);
    }

    @Override
    public <T> ListenableFuture<T> submitListenable(Callable<T> task) {
        showThreadPoolInfo("2. do submitListenable");
        return super.submitListenable(task);
    }

}
