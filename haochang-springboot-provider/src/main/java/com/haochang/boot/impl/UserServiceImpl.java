package com.haochang.boot.impl;

import com.haochang.api.UserService;
import com.haochang.model.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description: 描述：用户服务实现类
 * @author: youzhi.gao
 * @date: 2020-11-26 11:10
 */
@DubboService(interfaceClass = UserService.class, protocol = "dubbo")
public class UserServiceImpl implements UserService {

    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("name--" + id);
        return user;
    }
}
