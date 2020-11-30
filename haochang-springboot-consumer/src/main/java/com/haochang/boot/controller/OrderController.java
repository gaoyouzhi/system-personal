package com.haochang.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.haochang.api.OrderService;
import com.haochang.model.Order;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @description: 描述：订单controller
 * @author: youzhi.gao
 * @date: 2020-11-26 11:10
 */
@RestController
@RequestMapping("orders")
public class OrderController {

    @Reference(protocol = "dubbo")
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/id/{id}")
    public Order getOrderById(@PathVariable("id") Long id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("/userId/{userId}")
    public List<Order> getOrderByUserId(@PathVariable("userId") Long id){
        return orderService.getOrderByUserId(id);
    }

    @RequestMapping("/rest/{id}")
    public String getRestOrderById(@PathVariable("id") Long id) {
        try {
            //注意使用服务名称调用
            String echoString = restTemplate.getForObject("http://localhost:8888/orders/"+id, String.class, "1");
            return echoString;
        } catch (Exception e) {
            return null;
        }
    }


}
