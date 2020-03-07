package com.ikang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ThreadDemoApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(ThreadDemoApplication.class, args);
    }
}
