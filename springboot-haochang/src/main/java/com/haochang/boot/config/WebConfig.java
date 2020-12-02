package com.haochang.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: 描述：配置
 * @author: youzhi.gao
 * @date: 2020-12-02 15:01
 */
@Component
public class WebConfig  {

    @Value("${spring.user}")
    private String user;

    @Value("${random.int}")
    private int random;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
}
