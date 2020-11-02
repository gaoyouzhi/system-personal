package com.haochang.rocketmq.test;

import com.haochang.rocketmq.model.Message;
import com.haochang.rocketmq.model.StrongMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 描述：
 * @author: youzhi.gao
 * @date: 2020-11-02 10:31
 */
public class TestList {
    public static void main(String[] args) {
        List<StrongMessage> list = new ArrayList<>();
        Message message = new Message();
        list.add((StrongMessage) message);

        System.out.println(list);
    }
}
