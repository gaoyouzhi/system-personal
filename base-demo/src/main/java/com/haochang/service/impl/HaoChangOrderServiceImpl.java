package com.haochang.service.impl;

import com.haochang.service.OrderService;

/**
 * Created by gaoyouzhi on 2020/3/6.
 */
//@Service
public class HaoChangOrderServiceImpl implements OrderService {
    @Override
    public void query(Long id) {
        System.out.println("===========");
        System.out.println("this is haochang order, id is " + id);
    }
}
