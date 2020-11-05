package com.haochang.spring.aop;

import com.haochang.spring.model.House;
import com.haochang.spring.model.User;

/**
 * @description: 描述：中介服务
 * @author: youzhi.gao
 * @date: 2020-11-05 14:48
 */
public class MediumService implements ProxyInterface {
    private House house;

    public MediumService(final House house) {
        this.house = house;
    }

    @Override
    public House buyHouse(User user) {
        System.out.println("中介代看房");
        house.setBuyer(user);
        house.setPrice(10000.00);
        System.out.println("中介代办手续");
        return house;
    }
}
