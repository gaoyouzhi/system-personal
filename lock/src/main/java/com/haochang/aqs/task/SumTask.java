package com.haochang.aqs.task;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @description: 描述：求和任务  任务拆分  线程数量较多
 * @author: youzhi.gao
 * @date: 2020-09-30 10:28
 */
public class SumTask implements Callable<Long> {

    private static final int SEQ_CUTOFF = 10000;

    private ExecutorService executorService;

    private int[] array;

    private int low;

    private int high;

    public SumTask(ExecutorService executorService, int[] array, int low, int high) {
        this.executorService = executorService;
        this.array = array;
        this.low = low;
        this.high = high;
    }

    @Override
    public Long call() throws Exception {

        System.out.println(Thread.currentThread() + " range [" + low + "-" + high + "] begin to compute" );
        long result = 0;
        if(high - low <= SEQ_CUTOFF){
            for (int i = low; i < high; i++){
                result += array[i];
            }
            System.out.println(Thread.currentThread() + " range [" + low + "-" + high + "] finished compute " );
        } else {
            SumTask left = new SumTask(executorService, array, low, (high + low) / 2 );
            SumTask right = new SumTask(executorService, array, (high + low) / 2, high );

            Future<Long> lf = executorService.submit(left);
            Future<Long> rg = executorService.submit(right);

            result = lf.get() + rg.get();
            System.out.println(Thread.currentThread() + " range [" + low + "-" + high + "] finished compute " );
        }
        return result;
    }
}
