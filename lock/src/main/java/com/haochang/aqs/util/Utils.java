package com.haochang.aqs.util;

import java.util.Random;

/**
 * @description: 描述：工具类
 * @author: youzhi.gao
 * @date: 2020-09-30 13:55
 */
public class Utils {

    public static int[] buildRandomIntArray(int size) {
        int[] ints = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++){
            int num = random.nextInt(1000000);
            ints[i] = num;
        }

        return ints;
    }
}
