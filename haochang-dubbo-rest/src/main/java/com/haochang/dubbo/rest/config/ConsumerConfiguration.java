package com.haochang.dubbo.rest.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 描述：消费者配置类
 * @author: youzhi.gao
 * @date: 2020-11-25 11:19
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.haochang.dubbo.rest.comp")
@ComponentScan({"com.haochang.dubbo.rest.comp"})
public class ConsumerConfiguration {

    @Bean
    public RegistryConfig getRegistryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("localhost");
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setTimeout(1000);

        return registryConfig;
    }

    @Bean
    public ApplicationConfig getApplication(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("rest-consumer");

        return applicationConfig;
    }
}
