package com.haochang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/testBoot")
    public String testBoot(){
        return "123456";
    }

    @GetMapping("/pdf")
    public void testPDF(){
        return ;
    }

}
