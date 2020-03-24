package com.haochang.test;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @description: 描述：RocketMQ测试类(单机模式)
 * @author: youzhi.gao
 * @date: 2020-03-11 09:37
 */
public class RocketMQ {
    public static void main(String[] args) throws Exception {
        testProvider();
    }

    /**
     * @Description 描述：测试生产者
     * @Param
     * @Returns
     * @Author: youzhi.gao
     * @Date: 2020-03-11 9:38
     */
    private static void testProvider() throws Exception{
        DefaultMQProducer mqProducer = new DefaultMQProducer("simple-producer");
        mqProducer.setNamesrvAddr("127.0.0.1:9876");
        mqProducer.start();
        for (int i = 0; i < 100; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTest" /* Topic */,
                    "TagA" /* Tag */,
                    ("Hello RocketMQ " +
                            i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //Call send message to deliver message to one of brokers.
            SendResult sendResult = mqProducer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        //Shut down once the producer instance is not longer in use.
        mqProducer.shutdown();
    }
}
