package com.haochang.boot.controller;

import com.haochang.api.OrderService;
import com.haochang.model.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：订单controller
 * @author: youzhi.gao
 * @date: 2020-11-26 11:10
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @DubboReference
    private OrderService orderService;

    @RequestMapping("/id/{id}")
    public Order getOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }
}
