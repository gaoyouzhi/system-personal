package com.haochang.spring.controller;

import com.haochang.spring.model.OrderEvent;
import com.haochang.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 描述：基础controller
 * @author: youzhi.gao
 * @date: 2020-10-12 17:53
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping("/publish")
    @ResponseBody
    public String publish(){
        applicationEventPublisher.publishEvent(
                new OrderEvent("order", 1111L, "AAA",
                new User("aaa")));

        return "success";
    }

}
