package com.haochang.spring.application;

import com.haochang.spring.config.AppConfig;
import com.haochang.spring.model.User;
import com.haochang.spring.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：spring上下文测试
 * @author: youzhi.gao
 * @date: 2020-10-21 14:06
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        annotationConfigApplicationContext.registerBean("user", User.class);
//        BaseService baseService = annotationConfigApplicationContext.getBean("baseService", BaseService.class);
//        UserService userService1 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        UserService userService2 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        UserService userService3 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//
//        System.out.println(userService1);
//        System.out.println(userService2);
//        System.out.println(userService3);
//        System.out.println(baseService);

        User user = annotationConfigApplicationContext.getBean("user", User.class);
        System.out.println(user);

    }
}
