package com.ikang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @description: 描述：aop进行统一加密验证
 * @author: youzhi.gao@ikang.com
 * @date: 2020-02-14 10:50
 */
@Aspect
@Component
public class EncryptionAuth {


    private static final Logger logger = LoggerFactory.getLogger(EncryptionAuth.class);


    @Pointcut("execution( * com.ikang.controller.*.*(..))")
    public void EncryptionAuthCut() {
    }

    @Around("EncryptionAuthCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("请求地址 : " + request.getRequestURL().toString());
        logger.info("请求类型 : " + request.getMethod());
        logger.info("实现方法: " + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());

        logger.info("参数 : " + Arrays.toString(pjp.getArgs()));
        return pjp.proceed();
    }


}
