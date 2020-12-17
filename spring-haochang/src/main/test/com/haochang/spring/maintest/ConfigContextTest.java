package com.haochang.spring.maintest;


import com.haochang.spring.config.AppConfig;
import com.haochang.spring.model.OrderEvent;
import com.haochang.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：测试applicationContext
 * @author: youzhi.gao
 * @date: 2020-10-12 16:04
 */
public class ConfigContextTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Object user = annotationConfigApplicationContext.getBean("person");
        System.out.println(user);
    }
}
