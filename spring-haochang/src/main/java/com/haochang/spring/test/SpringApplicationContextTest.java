package com.haochang.spring.test;


import com.haochang.spring.config.AppConfig;
import com.haochang.spring.model.OrderEvent;
import com.haochang.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.EventListener;

/**
 * @description: 描述：测试applicationContext
 * @author: youzhi.gao
 * @date: 2020-10-12 16:04
 */
public class SpringApplicationContextTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        annotationConfigApplicationContext.registerBean("user", User.class);

        //发布事件
//        annotationConfigApplicationContext.publishEvent(new OrderEvent("order", 1111L, "AAA", new User("aaa")));

//        Object user = annotationConfigApplicationContext.getBean("person");
//        System.out.println(user);
    }
}
