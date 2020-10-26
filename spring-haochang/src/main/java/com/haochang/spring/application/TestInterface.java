package com.haochang.spring.application;

import com.haochang.spring.service.AliasNameService;
import com.haochang.spring.service.BaseService;
import com.haochang.spring.service.CommonService;

/**
 * @description: 描述：接口测试
 * @author: youzhi.gao
 * @date: 2020-10-22 20:20
 */
public class TestInterface {
    public static void main(String[] args) {
        Class clazz = null;
        try {
            clazz = Class.forName("com.haochang.spring.service.impl.BeanFactoryService");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        matchBeansByName(clazz);

        matchBeansByType(clazz);

    }

    /**
     * 方法功能描述：通过类型匹配接口
     * @MethodName: matchBeansByType
     * @param clazz
     * @Return:
     * @Author: yz.gao
     * @Date: 2020-10-26 9:22
     */
    private static void matchBeansByType(Class clazz) {
        //直接判断类是否实现了某个接口
        if(BaseService.class.isAssignableFrom(clazz)){
            System.out.println(clazz.getSimpleName() + " 实现了 " + BaseService.class.getName() + "接口");
        } else {
            System.out.println(clazz.getSimpleName() + " 没有实现了 " + BaseService.class.getName() + "接口");
        }

        if(AliasNameService.class.isAssignableFrom(clazz)){
            System.out.println(clazz.getSimpleName() + " 实现了 " + AliasNameService.class.getName() + "接口");
        } else {
            System.out.println(clazz.getSimpleName() + " 没有实现了 " + AliasNameService.class.getName() + "接口");
        }

        if(CommonService.class.isAssignableFrom(clazz)){
            System.out.println(clazz.getSimpleName() + " 实现了 " + CommonService.class.getName() + "接口");
        } else {
            System.out.println(clazz.getSimpleName() + " 没有实现了 " + CommonService.class.getName() + "接口");
        }
    }

    /**
     * 方法功能描述：通过名字匹配接口
     * @MethodName: matchBeansByName
     * @param clazz
     * @Return:
     * @Author: yz.gao
     * @Date: 2020-10-26 9:22
     */
    private static void matchBeansByName(Class clazz) {
        //通过名字来判断类是否实现了某个接口
        if (null != clazz) {
            for (Class cl : clazz.getInterfaces()) {
                if (cl.getName().equals(BaseService.class.getName())) {
                    System.out.println(clazz.getSimpleName() + " 实现了 " + BaseService.class.getName() + "接口");
                } else if (cl.getName().equals(AliasNameService.class.getName())) {
                    System.out.println(clazz.getSimpleName() + " 实现了 " + AliasNameService.class.getName() + "接口");
                } else if (cl.getName().equals(CommonService.class.getName())) {
                    System.out.println(clazz.getSimpleName() + " 实现了 " + CommonService.class.getName() + "接口");
                }

            }
        }

    }
}
