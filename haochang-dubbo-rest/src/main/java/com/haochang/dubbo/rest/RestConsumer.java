package com.haochang.dubbo.rest;

import com.haochang.dubbo.rest.api.UserService;
import com.haochang.dubbo.rest.config.ConsumerConfiguration;
import com.haochang.dubbo.rest.comp.UserServiceComponent;
import com.haochang.dubbo.rest.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestConsumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

        UserService userService = context.getBean(UserServiceComponent.class);
        System.out.println(">>> " + userService.getUser(1L));

        User user = new User(2L, "Larry Page");
        System.out.println(">>> " + userService.registerUser(user));
    }


}
