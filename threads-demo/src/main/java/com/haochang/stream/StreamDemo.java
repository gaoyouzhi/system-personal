package com.haochang.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by gaoyouzhi on 2020/3/8.
 */
public class StreamDemo {
    public static void main(String[] args) {
        //集合中的方法获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String, String> map = new HashMap<>();
        Stream<String> stream2 = map.keySet().stream();
        Stream<String> stream3 = map.values().stream();
        Stream<Map.Entry<String, String>> stream4 = map.entrySet().stream();

        //传递数组获取流
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        int[] a = new int[]{5,4,3,2,1};
        Stream<int[]> a1 = Stream.of(a);
        int[] x={11,12,13};
        Stream<int[]> x1 = Stream.of(x);

        //stream 终结流处理
        a1.forEach((m)->{
            System.out.println(m);
        });


    }
}
