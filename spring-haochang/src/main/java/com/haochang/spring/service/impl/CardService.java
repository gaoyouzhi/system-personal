package com.haochang.spring.service.impl;

import com.haochang.spring.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: 描述：实现接触接口
 * @author: youzhi.gao
 * @date: 2020-10-22 20:18
 */
@Component
public class CardService implements BaseService {

    //属性注入
//    @Autowired
    private UserService userService;

    //构造方法注入
//    @Autowired
//    public CardService() {
//        System.out.println("============构造方法注入=========" + userService);
//    }

    public UserService getUserService() {
        return userService;
    }

    //set方法注入
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        System.out.println("===========set  方法注入  =============");
    }
}
