package com.haochang.controller;

import com.haochang.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping("/getRedisList")
    public void getRedisList(){

    }


}
