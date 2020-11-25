package com.haochang.dubbo.rest.comp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haochang.dubbo.rest.api.UserService;
import com.haochang.dubbo.rest.model.User;
import org.springframework.stereotype.Component;

/**
 * @description: 描述：注入spring种
 * @author: youzhi.gao
 * @date: 2020-11-25 14:11
 */
@Component
public class UserServiceComponent implements UserService {

    @Reference
    private UserService userService;

    @Override
    public User getUser(Long id) {
        return userService.getUser(id);
    }

    @Override
    public Long registerUser(User user) {
        return userService.registerUser(user);
    }
}
