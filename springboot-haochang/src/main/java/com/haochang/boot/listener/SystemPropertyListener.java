package com.haochang.boot.listener;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @description: 描述：系统变量listener
 * @author: youzhi.gao
 * @date: 2020-12-03 09:41
 */
public class SystemPropertyListener implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableListableBeanFactory factory = applicationContext.getBeanFactory();

    }
}
