package com.haochang.service.impl;

import com.haochang.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by gaoyouzhi on 2020/3/6.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void query(Long id) {
        System.out.println("this is the order, it's id is " + id);
    }
}
