package com.haochang.rocketmq.callback;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;

/**
 * @description: 描述：异步消息callback
 * @author: youzhi.gao
 * @date: 2020-11-02 10:19
 */
public class AsyncMessageCallBack implements SendCallback {
    @Override
    public void onSuccess(SendResult sendResult) {
        System.out.println(sendResult.getMsgId() + sendResult.getSendStatus());
    }

    @Override
    public void onException(Throwable e) {
        System.out.println(e.getMessage());
    }
}
