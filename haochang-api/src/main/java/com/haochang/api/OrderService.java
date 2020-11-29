package com.haochang.api;


import com.haochang.model.Order;

/**
 * @description: 描述：订单service
 * @author: youzhi.gao
 * @date: 2020-11-25 15:46
 */
public interface OrderService {

    Order getOrderById(Long Id);

}
