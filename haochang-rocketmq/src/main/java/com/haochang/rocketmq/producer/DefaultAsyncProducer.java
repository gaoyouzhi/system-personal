package com.haochang.rocketmq.producer;

import com.haochang.rocketmq.callback.AsyncMessageCallBack;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @description: 描述：生产者 发送异步消息设置
 * @author: youzhi.gao
 * @date: 2020-10-28 17:29
 */
public class DefaultAsyncProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("test-group-haochang");
        producer.setNamesrvAddr("127.0.0.1:9876");

        producer.start();
        //发送异步消息设置
        producer.setRetryTimesWhenSendAsyncFailed(0);
        final CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++){
            Message message = new Message();
            message.setTopic("testTopic");
            message.setBody(("hello 消息" + i).getBytes());
            message.setDelayTimeLevel(1);

            //发送同步消息
            producer.send(message, new AsyncMessageCallBack());
        }

        //等待五秒 如果不在发送消息则关闭
        countDownLatch.await(5, TimeUnit.SECONDS);
        System.out.println("=============等待时间5s已到==============");
        producer.shutdown();
    }
}
