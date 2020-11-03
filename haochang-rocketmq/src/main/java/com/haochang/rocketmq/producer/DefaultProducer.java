package com.haochang.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @description: 描述：生产者
 * @author: youzhi.gao
 * @date: 2020-10-28 17:29
 */
public class DefaultProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("test-group-haochang");
        producer.setNamesrvAddr("127.0.0.1:9876");

        producer.start();

        for (int i = 0; i < 100; i++){
            Message message = new Message();
            message.setTopic("testTopic");
            message.setBody(("hello 消息" + i).getBytes());
            message.setDelayTimeLevel(1);

            //发送同步消息
            SendResult result = producer.send(message);
            System.out.println(result.toString());
        }

        producer.shutdown();
    }
}
