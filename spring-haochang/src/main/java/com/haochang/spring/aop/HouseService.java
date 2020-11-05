package com.haochang.spring.aop;

import com.haochang.spring.model.House;
import com.haochang.spring.model.User;

/**
 * @description: 描述：买房实现类
 * @author: youzhi.gao
 * @date: 2020-11-05 14:36
 */
public class HouseService implements ProxyInterface{
    @Override
    public House buyHouse(User user) {
        House house = new House();
        house.setBuyer(user);
        house.setLocation("TJ");
        house.setPrice(1000000.00);

        return house;
    }
}
