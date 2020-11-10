package com.haochang.spring.config;

import com.haochang.spring.model.OrderEvent;
import com.haochang.spring.service.impl.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.*;

/**
 * @description: 描述：application配置
 * @author: youzhi.gao
 * @date: 2020-10-12 16:07
 */
@Configuration
@ComponentScan(value = "com.haochang.spring.service")
//@MapperScan(basePackages = "com.haochang.spring.mapper")
//@ImportResource(value = "classpath:spring-mybatis-context.xml")
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
