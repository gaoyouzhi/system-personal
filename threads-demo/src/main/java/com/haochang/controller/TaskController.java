package com.haochang.controller;

import com.haochang.demo.OrderTask;
import com.haochang.demo.RmsThreadPool;
import com.haochang.model.Order;
import com.haochang.service.OrderService;
import com.haochang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：任务控制器
 * @author: youzhi.gao
 * @date: 2020-11-04 11:07
 */
@RestController
@RequestMapping("/order")
public class TaskController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/orderTask")
    public String orderTask(){
        Order order = orderService.getOrderById(111L);
        RmsThreadPool.threads.execute(new OrderTask(order, studentService));

        return "success";
    }
}
