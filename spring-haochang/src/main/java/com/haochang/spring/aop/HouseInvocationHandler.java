package com.haochang.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: 描述：代理handler
 * @author: youzhi.gao
 * @date: 2020-11-05 15:11
 */
public class HouseInvocationHandler implements InvocationHandler {
    private Object object;

    public HouseInvocationHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=====before invoke ===================");
        Object result = method.invoke(object, args);
        System.out.println("=====after invoke ===================");
        return result;
    }
}
