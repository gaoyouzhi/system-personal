package com.haochang.rocketmq;

import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @description: 描述：顺序选择器
 * @author: youzhi.gao
 * @date: 2020-11-02 09:58
 */
@Configuration
public class OrderlySelector {



    @Bean
    public MessageListenerOrderly messageListenerOrderly(){
        return new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> list, ConsumeOrderlyContext consumeOrderlyContext) {

                return ConsumeOrderlyStatus.SUCCESS;
            }
        };
    }
}
