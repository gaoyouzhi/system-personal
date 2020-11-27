package com.haochang.boot.impl;

import com.haochang.api.OrderService;
import com.haochang.model.Order;
import org.apache.dubbo.config.annotation.DubboService;

//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

/**
 * @description: 描述：订单服务实现类
 * @author: youzhi.gao
 * @date: 2020-11-25 15:49
 */
//@Path("order")
@DubboService(interfaceClass = OrderService.class, protocol = {"dubbo"})
//@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
//@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class OrderServiceImpl implements OrderService {


//    @GET
//    @Path("{id: \\d+}")
    public Order getOrderById(Long Id) {
        Order order = new Order();
        order.setId(Id);
        order.setName("order-" + Id);
        return order;
    }
}
