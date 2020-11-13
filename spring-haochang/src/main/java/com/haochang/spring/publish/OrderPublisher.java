package com.haochang.spring.publish;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @description: 描述：订单发布器
 * @author: youzhi.gao
 * @date: 2020-11-10 20:19
 */
public class OrderPublisher implements ApplicationEventPublisher {

    private String name;

    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void publishEvent(ApplicationEvent event) {

    }

    @Override
    public void publishEvent(Object event) {

    }
}
