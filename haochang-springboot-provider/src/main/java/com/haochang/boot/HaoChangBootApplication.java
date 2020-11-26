package com.haochang.boot;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 描述：boot项目
 * @author: youzhi.gao
 * @date: 2020-11-25 09:29
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.haochang.boot.impl")
public class HaoChangBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaoChangBootApplication.class, args);
    }
}
