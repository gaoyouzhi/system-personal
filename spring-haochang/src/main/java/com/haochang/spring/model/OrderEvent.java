package com.haochang.spring.model;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @description: 描述：订单事件
 * @author: youzhi.gao
 * @date: 2020-10-12 17:20
 */
public class OrderEvent extends ApplicationEvent implements Serializable {
    private static final long serialVersionUID = 7461920767087050980L;

    private Long orderId;
    private String orderName;
    private User buyer;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public OrderEvent(Object source) {
        super(source);
    }

    public OrderEvent(Object source, Long orderId, String orderName, User buyer) {
        super(source);
        this.orderId = orderId;
        this.orderName = orderName;
        this.buyer = buyer;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", buyer=" + buyer +
                '}';
    }
}
