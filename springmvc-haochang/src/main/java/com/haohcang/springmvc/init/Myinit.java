package com.haohcang.springmvc.init;

import com.haohcang.springmvc.Start;
import com.haohcang.springmvc.servlet.DispatcherServlet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.util.Set;

//SPI
public class Myinit implements ServletContainerInitializer{

    @Override
    public void onStartup(Set<Class<?>> c,ServletContext servletContext) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Start.class);

        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic dy = servletContext.addServlet("app",servlet);
        dy.setLoadOnStartup(1);
        dy.addMapping("*.do");

      /*  JspServlet jspServlet = new JspServlet();
        ServletRegistration.Dynamic dy1 = servletContext.addServlet("app1",jspServlet);
        dy1.setLoadOnStartup(2);
        dy1.addMapping("*.jsp");*/
    }

}
