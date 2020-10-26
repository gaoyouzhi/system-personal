package com.haochang.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description: 描述：判断是否是windows系统
 * @author: youzhi.gao
 * @date: 2020-10-26 14:43
 */
@Configuration
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if(context.getEnvironment().getProperty("OS").equals("Windows_NT")){
            return true;
        }
        return false;
    }
}
