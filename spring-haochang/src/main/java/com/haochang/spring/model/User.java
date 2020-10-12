package com.haochang.spring.model;

/**
 * @description: 描述：用户类
 * @author: youzhi.gao
 * @date: 2020-10-12 16:10
 */
public class User {
    private String name;
    private int sex;

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
