package com.haochang.spring.sort;

import java.util.Arrays;

/**
 * @description: 描述：冒泡排序
 * @author: youzhi.gao
 * @date: 2020-10-13 09:01
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{123, 125,62, 23, 23};

        toBubbleSort(arr);
    }

    /**
     * 方法功能描述：冒泡排序
     * @MethodName: toBubbleSort
     * @param arr
     * @Return:
     * @Author: yz.gao
     * @Date: 2020-10-13 9:03
     */
    private static void toBubbleSort(int[] arr) {
        if(null == arr || arr.length == 0){
            return;
        }

        for (int i = 0; i < arr.length; i++){
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j ++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
