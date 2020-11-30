package com.haochang.boot.impl;

import com.haochang.api.OrderService;
import com.haochang.model.Order;
import org.apache.dubbo.config.annotation.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 描述：订单服务实现类
 * @author: youzhi.gao
 * @date: 2020-11-25 15:49
 */
@Path("orders")
@Service(interfaceClass = OrderService.class, protocol = {"dubbo","rest"})
public class OrderServiceImpl implements OrderService {


    @GET
    @Path("{id: \\d+}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    public Order getOrderById(@PathParam("id") Long Id) {
        Order order = new Order();
        order.setId(Id);
        order.setName("order-" + Id);
        return order;
    }

    public List<Order> getOrderByUserId(Long userId) {
        List<Order> list = new ArrayList<>();
        Order order = new Order();
        order.setId(111L);
        order.setUserId(userId);
        order.setName("id" + 111);
        list.add(order);

        Order order1 = new Order();
        order1.setId(222L);
        order1.setUserId(userId);
        order1.setName("id" + 222);
        list.add(order1);

        return list;
    }
}
