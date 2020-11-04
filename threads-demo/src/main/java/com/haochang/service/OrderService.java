package com.haochang.service;

import com.haochang.model.Order;

/**
 * Created by gaoyouzhi on 2020/3/6.
 */
public interface OrderService {
    Order query(Long id);

    Order getOrderById(Long id);
}
