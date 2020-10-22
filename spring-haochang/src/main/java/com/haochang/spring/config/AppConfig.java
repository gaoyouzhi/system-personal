package com.haochang.spring.config;

import com.haochang.spring.model.OrderEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 描述：application配置
 * @author: youzhi.gao
 * @date: 2020-10-12 16:07
 */
@Configuration
@ComponentScan(value = "com.haochang.spring")
public class AppConfig {

    /**
     * 方法功能描述：注册事件监听
     * @MethodName: applicationListener
     * @param
     * @Return: {@link ApplicationListener}
     * @Author: yz.gao
     * @Date: 2020-10-12 17:31
     */
    @Bean
    public ApplicationListener applicationListener(){
        return new ApplicationListener() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
               if(event instanceof OrderEvent){
                   System.out.println("收到事件" + event.toString() );
               } else {
                   System.out.println(event.getSource());
               }
            }
        };
    }

}
