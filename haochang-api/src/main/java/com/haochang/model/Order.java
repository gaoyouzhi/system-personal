package com.haochang.model;

import java.io.Serializable;

/**
 * @description: 描述：订单
 * @author: youzhi.gao
 * @date: 2020-11-25 15:47
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -6055045160325010263L;

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
