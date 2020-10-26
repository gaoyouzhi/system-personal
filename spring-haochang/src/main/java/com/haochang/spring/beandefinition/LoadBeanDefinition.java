package com.haochang.spring.beandefinition;

import com.haochang.spring.config.AppConfig;
import com.haochang.spring.model.Person;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：加载beandefination
 * @author: youzhi.gao
 * @date: 2020-10-23 09:21
 */
public class LoadBeanDefinition {
    public static void main(String[] args) {
        //解析注解
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //解析xml文件中的BeanDefinition
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(annotationConfigApplicationContext);
        System.out.println(xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml"));

        //通过注解来解析BeanDefinition
        //AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(annotationConfigApplicationContext);
        //annotatedBeanDefinitionReader.register(Person.class);


        System.out.println(annotationConfigApplicationContext.getBean("person"));
    }
}
