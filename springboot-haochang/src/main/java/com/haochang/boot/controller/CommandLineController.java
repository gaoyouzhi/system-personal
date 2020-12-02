package com.haochang.boot.controller;

import com.haochang.boot.config.WebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：命令行测试
 * @author: youzhi.gao
 * @date: 2020-12-02 18:22
 */
@RestController
@RequestMapping("/command")
public class CommandLineController {


    @Autowired
    private WebConfig webConfig;

    @RequestMapping("/random")
    public int random(){
        return webConfig.getRandom();
    }

    @RequestMapping("/user")
    public String getUser(){
        return webConfig.getUser();
    }
}
