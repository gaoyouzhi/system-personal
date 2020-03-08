package com.ikang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication()
@EnableWebMvc
public class ThreadDemoApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(ThreadDemoApplication.class, args);
    }
}
