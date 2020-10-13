package com.haochang.spring.sort;

import java.util.Arrays;

/**
 * @description: 描述：插入排序
 * @author: youzhi.gao
 * @date: 2020-10-13 09:09
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{12, 15, 166, 118};
        toInsertSort(a);

    }

    private static void toInsertSort(int[] a) {
        if(null == a || a.length == 0){
            return;
        }

        for (int i = 1; i < a.length; i++){

            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j){
                if(a[j] > value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }

        System.out.println(Arrays.toString(a));
    }
}
