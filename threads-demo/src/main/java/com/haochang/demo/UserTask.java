package com.haochang.demo;

/**
 * @description: 描述：用户定时任务
 * @author: youzhi.gao
 * @date: 2020-11-04 10:14
 */
public class UserTask implements Runnable {

    @Override
    public void run() {
        System.out.println("开始处理用户任务");
    }
}
