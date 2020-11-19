package com.haohcang.springmvc.controller;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component("/testController")//通过id定义url
public class TestController implements Controller{

    @Override
    public Object handler(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("TestController");
        return null;
    }
}
