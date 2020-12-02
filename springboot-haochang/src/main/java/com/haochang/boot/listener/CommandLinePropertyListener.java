package com.haochang.boot.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.*;
import org.springframework.util.Assert;

/**
 * @description: 描述：更改环境变量listener
 * @author: youzhi.gao
 * @date: 2020-12-02 10:24
 */
public class CommandLinePropertyListener implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        Environment environment = configurableApplicationContext.getEnvironment();
        Assert.notNull(environment, "[Assertion failed] - this argument is required; it must not be null");
        MutablePropertySources propertySources = ((ConfigurableEnvironment) environment).getPropertySources();
        if(propertySources.contains("commandLineArgs")){
            PropertySource<?> propertySource = propertySources.get("commandLineArgs");
            if(propertySource instanceof SimpleCommandLinePropertySource){
                SimpleCommandLinePropertySource commandLinePropertySource = ((SimpleCommandLinePropertySource) propertySource);
                String[] sources = commandLinePropertySource.getPropertyNames();
                for (int i = 0; i < sources.length; i++){
                    if(sources[i].equals("spring.user")){
//                        commandLinePropertySource.setProperty("spring.user");
                    }
                }
            }
        }
    }
}
