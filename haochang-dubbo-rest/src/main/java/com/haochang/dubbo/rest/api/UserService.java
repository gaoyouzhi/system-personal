package com.haochang.dubbo.rest.api;

import com.haochang.dubbo.rest.model.User;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @description: 描述：服务接口
 * @author: youzhi.gao
 * @date: 2020-11-25 11:14
 */
@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface UserService {

    @GET
    @Path("{id: \\d+}")
    User getUser(@PathParam("id") Long id);

    @POST
    @Path("register")
    Long registerUser(User user);
}
