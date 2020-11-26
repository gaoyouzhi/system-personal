package com.haochang.model;

import java.io.Serializable;

/**
 * @description: 描述：用户
 * @author: youzhi.gao
 * @date: 2020-11-26 11:08
 */
public class User implements Serializable {
    private static final long serialVersionUID = -2423173719728605602L;

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
