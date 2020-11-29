package com.haochang.boot.controller;

import com.haochang.api.UserService;
import com.haochang.model.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：用户controller
 * @author: youzhi.gao
 * @date: 2020-11-26 11:09
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/{userId}")
    public User getUserByUserId(@PathVariable("userId")Long userId){
        return userService.getUserById(userId);
    }
}
