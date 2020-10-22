package com.haochang.spring.application;

import com.haochang.spring.config.AppConfig;
import com.haochang.spring.service.*;
import com.haochang.spring.service.impl.BeanFactoryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：spring上下文测试
 * @author: youzhi.gao
 * @date: 2020-10-21 14:06
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        UserService userService1 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        UserService userService2 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        UserService userService3 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//
//        System.out.println(userService1);
//        System.out.println(userService2);
//        System.out.println(userService3);

        Class clazz = null;
        try {
            clazz = Class.forName("com.haochang.spring.service.impl.BeanFactoryService");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(null != clazz){
            for(Class cl : clazz.getInterfaces()){
                if (cl.getName().equals(BaseService.class.getName())){
                    System.out.println(clazz.getSimpleName() + " 实现了 " + BaseService.class.getName() + "接口");
                } else if (cl.getName().equals(AliasNameService.class.getName())){
                    System.out.println(clazz.getSimpleName() + " 实现了 " + AliasNameService.class.getName() + "接口");
                } else if (cl.getName().equals(CommonService.class.getName())){
                    System.out.println(clazz.getSimpleName() + " 实现了 " + CommonService.class.getName() + "接口");
                }

            }




        }
    }
}
