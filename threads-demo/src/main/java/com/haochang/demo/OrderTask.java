package com.haochang.demo;

import com.haochang.model.Order;
import com.haochang.service.OrderService;
import com.haochang.service.StudentService;

/**
 * @description: 描述：订单任务
 * @author: youzhi.gao
 * @date: 2020-11-04 10:15
 */
public class OrderTask implements Runnable {

    private Order order;

    private StudentService studentService;

    public OrderTask(Order order, StudentService studentService) {
        this.order = order;
        this.studentService = studentService;
    }

    @Override
    public void run() {
        studentService.getStudentInfoById(order.getId());
        System.out.println("开始处理订单任务");
    }
}
