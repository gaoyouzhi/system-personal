package com.haochang.dubbo.rest.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haochang.dubbo.rest.api.UserService;
import com.haochang.dubbo.rest.model.User;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: 描述：用户服务实现类
 * @author: youzhi.gao
 * @date: 2020-11-25 11:15
 */
@Service
public class UserServiceImpl implements UserService {

    private final AtomicLong id = new AtomicLong();
    public User getUser(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("name =>" + id);
        return user;
    }


    public Long registerUser(User user){
       return id.incrementAndGet();
    }
}
