package com.haochang.boot.impl;

import com.haochang.api.OrderService;
import com.haochang.model.Order;
import org.apache.dubbo.config.annotation.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @description: 描述：订单服务实现类
 * @author: youzhi.gao
 * @date: 2020-11-25 15:49
 */
@Path("orders")
@Service(interfaceClass = OrderService.class, protocol = {"dubbo","rest"})
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class OrderServiceImpl implements OrderService {


    @GET
    @Path("{id: \\d+}")
    public Order getOrderById(@PathParam("id") Long Id) {
        Order order = new Order();
        order.setId(Id);
        order.setName("order-" + Id);
        return order;
    }
}
