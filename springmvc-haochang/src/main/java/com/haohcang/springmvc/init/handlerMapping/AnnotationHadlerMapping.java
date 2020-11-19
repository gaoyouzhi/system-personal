package com.haohcang.springmvc.init.handlerMapping;

import com.haohcang.springmvc.annotation.RequestMapping;
import com.haohcang.springmvc.servlet.RequestMappingInfo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class AnnotationHadlerMapping  implements HandlerMapping,InstantiationAwareBeanPostProcessor {

    public static Map<String,RequestMappingInfo> map = new HashMap<>();

    @Override
    //bean里面会有多个处理器
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        Method[] methods = bean.getClass().getDeclaredMethods();
        for(Method method : methods){
            RequestMappingInfo requestMappingInfo = createRequestMappingInfo(method,bean);
            map.put(requestMappingInfo.getUri(),requestMappingInfo);
        }
        return true;
    }

    private RequestMappingInfo createRequestMappingInfo(Method method,Object bean) {
        RequestMappingInfo requestMappingInfo = new RequestMappingInfo();
        if(method.isAnnotationPresent(RequestMapping.class)){
            requestMappingInfo.setMethod(method);
            requestMappingInfo.setUri(method.getDeclaredAnnotation(RequestMapping.class).value());
            requestMappingInfo.setObj(bean);
        }
        return requestMappingInfo;
    }

    @Override
    public Object getHandlerMapping(String requestURI) {
        return map.get(requestURI);
    }
}
