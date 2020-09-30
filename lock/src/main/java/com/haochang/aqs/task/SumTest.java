package com.haochang.aqs.task;

import com.haochang.aqs.util.Utils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 描述：测试求和
 * @author: youzhi.gao
 * @date: 2020-09-30 10:49
 */
public class SumTest {
    public static void main(String[] args) throws Exception {
        int size = 1000000;
        int[] array = Utils.buildRandomIntArray(size);

        Long result = sum(array);

        System.out.println(result);
    }

    private static Long sum(int[] array) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        SumTask sumTask = new SumTask(executorService, array, 0, array.length);
        Long result = executorService.submit(sumTask).get();
        return  result;
    }
}
