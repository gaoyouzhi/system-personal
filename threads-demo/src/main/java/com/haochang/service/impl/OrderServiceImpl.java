package com.haochang.service.impl;

import com.haochang.model.Order;
import com.haochang.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by gaoyouzhi on 2020/3/6.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order query(Long id) {
        System.out.println("===========");
        System.out.println("this is haochang order, id is " + id);
        Order order = new Order();
        order.setId(id);
        return order;
    }

    @Override
    public Order getOrderById(Long id) {
        System.out.println("===========");
        Order order = new Order();
        System.out.println("this is haochang order, id is " + id);
        order.setId(id);
        return order;
    }
}
