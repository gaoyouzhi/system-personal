package com.haochang.api;

import com.haochang.model.User;

/**
 * @description: 描述：用户
 * @author: youzhi.gao
 * @date: 2020-11-26 11:08
 */
public interface UserService {
    User getUserById(Long id);
}
