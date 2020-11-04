package com.haochang.model;


import java.io.Serializable;

/**
 * @description: 描述：订单
 * @author: youzhi.gao
 * @date: 2020-11-04 10:52
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 6890101319014097567L;

    private Long id;
    private String orderName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
