package com.haochang.spring.model;

import java.io.Serializable;

/**
 * @description: 描述：房子
 * @author: youzhi.gao
 * @date: 2020-11-05 14:36
 */
public class House implements Serializable {
    private static final long serialVersionUID = -2971153621360229940L;
    private String location;

    private Double price;

    private User buyer;

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", buyer=" + buyer +
                '}';
    }
}
