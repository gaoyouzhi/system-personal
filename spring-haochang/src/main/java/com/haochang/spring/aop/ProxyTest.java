package com.haochang.spring.aop;

import com.haochang.spring.model.House;
import com.haochang.spring.model.User;

import java.lang.reflect.Proxy;

/**
 * @description: 描述：动态代理
 * @author: youzhi.gao
 * @date: 2020-11-05 14:04
 */
public class ProxyTest {
    public static void main(String[] args) {
        User user = new User();

//        House house1 = new HouseService().buyHouse(user);
//        System.out.println(house1.toString());

//        House house = new MediumService(new House()).buyHouse(user);
//        System.out.println(house.toString());

        HouseService houseService = new HouseService();
        ProxyInterface result = (ProxyInterface) Proxy.newProxyInstance(HouseService.class.getClassLoader(), new Class[]{ProxyInterface.class}, new HouseInvocationHandler(houseService));
        House house2 = result.buyHouse(user);
        System.out.println(house2.toString());
    }
}
