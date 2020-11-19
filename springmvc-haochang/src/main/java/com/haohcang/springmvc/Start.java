package com.haohcang.springmvc;

import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.haochang")
public class Start {

    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.addWebapp("/", "classpath:");

        tomcat.start();
        tomcat.getServer().await();

    }
}
