package com.haochang.api;


import com.haochang.model.Order;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @description: 描述：订单service
 * @author: youzhi.gao
 * @date: 2020-11-25 15:46
 */
@Path("order")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface OrderService {

    @GET
    @Path("{id: \\d+}")
    Order getOrderById(@PathParam("id") Long Id);

}
