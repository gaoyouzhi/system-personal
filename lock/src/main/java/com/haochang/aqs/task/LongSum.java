package com.haochang.aqs.task;

import java.util.concurrent.RecursiveTask;

/**
 * @description: 描述：并行框架
 * @author: youzhi.gao
 * @date: 2020-09-30 09:29
 */
public class LongSum extends RecursiveTask<Long> {

    private int high;

    private int low;

    private int[] array;

    private static final int threadHolder = 1000;

    public LongSum(int high, int low, int[] array) {
        this.high = high;
        this.low = low;
        this.array = array;
    }

    @Override
    protected Long compute() {
        if(high - low <= threadHolder){
            Long sum = 0L;
            for (int i = low; i < high; i++){
                sum += array[i];
            }
            return sum;
        } else {
            int mid = low + (high - low) / 2;
            LongSum left = new LongSum(mid, low, array);
            LongSum right = new LongSum(high, mid, array);

            left.fork();
            right.fork();

            long rightAns = right.join();
            long leftAns = left.join();

            return rightAns + leftAns;
        }
    }
}
