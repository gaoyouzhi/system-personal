package com.haochang.spring.model;

import com.haochang.spring.condition.WindowsCondition;
import com.haochang.spring.service.impl.UserService;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @description: 描述：用户类
 * @author: youzhi.gao
 * @date: 2020-10-12 16:10
 */
//@Scope("prototype")
//@Conditional({WindowsCondition.class})
    @Component
public class User {
    private String name;
    private int sex;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
