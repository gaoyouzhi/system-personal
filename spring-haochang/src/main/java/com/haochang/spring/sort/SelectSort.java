package com.haochang.spring.sort;

import java.util.Arrays;

/**
 * @description: 描述：选择排序
 * @author: youzhi.gao
 * @date: 2020-10-13 17:26
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = new int[]{111,222,333,41,11,415};
        toSelectSort(a);
    }

    /**
     * 方法功能描述：选择排序
     * @MethodName: toSelectSort
     * @param
     * @Return:
     * @Author: yz.gao
     * @Date: 2020-10-13 17:27
     */
    private static void toSelectSort(int[] a) {
        if(a == null || a.length <= 1){
            return;
        }

        for (int j = a.length - 1; j > 0; j--){
            for (int i = 0; i < j; i++){
                if(a[i] < a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
