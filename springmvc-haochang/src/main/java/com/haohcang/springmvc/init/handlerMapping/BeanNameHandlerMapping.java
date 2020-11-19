package com.haohcang.springmvc.init.handlerMapping;

import com.haohcang.springmvc.controller.Controller;
import com.haohcang.springmvc.servlet.RequestMappingInfo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BeanNameHandlerMapping  implements HandlerMapping,InstantiationAwareBeanPostProcessor {

    public static Map<String, Controller> map = new HashMap<>();

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.startsWith("/")){
            map.put(beanName,(Controller)bean);
        }
        return true;
    }

    @Override
    public Object getHandlerMapping(String requestURI) {
        return map.get(requestURI);
    }
}
