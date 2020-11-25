package com.haochang.dubbo.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @description: 描述：dubbo配置
 * @author: youzhi.gao
 * @date: 2020-11-25 11:18
 */
public class DubboConfiguration {

    public ProviderConfiguration getProviderConfiguration(){
        ProviderConfiguration providerConfiguration = new ProviderConfiguration();
        return providerConfiguration;
    }

    public ConsumerConfiguration getConsumerConfiguration(){
        ConsumerConfiguration consumerConfiguration = new ConsumerConfiguration();
        return consumerConfiguration;
    }
}
