package com.haochang.spring.maintest;


import com.haochang.spring.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：测试applicationContext
 * @author: youzhi.gao
 * @date: 2020-10-12 16:04
 */
public class SpringApplicationContextTest {

    public static final Logger logger = LoggerFactory.getLogger(SpringApplicationContextTest.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("===================初始化spring容器成功=======================");
//        annotationConfigApplicationContext.registerBean("user", User.class);

        //发布事件
//        annotationConfigApplicationContext.publishEvent(new OrderEvent("order", 1111L, "AAA", new User("aaa")));

        Object user = annotationConfigApplicationContext.getBean("cardService");
        logger.info("===================打印user=======================");
        System.out.println(user);
    }
}
