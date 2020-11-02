package com.haochang.rocketmq.producer;

import org.apache.rocketmq.client.producer.TransactionMQProducer;

/**
 * @description: 描述：事务消息
 * @author: youzhi.gao
 * @date: 2020-10-30 09:43
 */
public class TransactionProducer {
    public static void main(String[] args) {
        TransactionMQProducer transactionMQProducer = new TransactionMQProducer("test-transaction-group");

    }
}
