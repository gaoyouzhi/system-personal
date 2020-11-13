package com.haochang.spring.aop;


import com.haochang.spring.service.impl.UserService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * @description: 描述：测试aop
 * @author: youzhi.gao
 * @date: 2020-11-11 14:10
 */
public class AOPTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        UserService userService = new UserService();
        proxyFactory.setTarget(userService);

//        proxyFactory.addAdvice(new MethodBeforeAdvice() {
//            @Override
//            public void before(Method method, Object[] args, Object target) throws Throwable {
//                System.out.println("=======代理方法执行之前=========");
//            }
//        });


        proxyFactory.addAdvisor(new MyAdvisor());
        UserService userService1 = (UserService) proxyFactory.getProxy();
        userService1.test();
    }

}
