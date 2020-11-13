package com.haochang.spring.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @description: 描述：aop 中的切入的实体信息
 * @author: youzhi.gao
 * @date: 2020-11-11 15:10
 */
public class MyAdvisor implements PointcutAdvisor {

    @Override
    public Pointcut getPointcut() {
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.addMethodName("test");
        return nameMatchMethodPointcut;
    }

    @Override
    public Advice getAdvice() {
        MethodBeforeAdvice methodBeforeAdvice = new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println("=============执行before aop==========");
            }
        };
        return methodBeforeAdvice;
    }

    @Override
    public boolean isPerInstance() {
        return false;
    }
}
