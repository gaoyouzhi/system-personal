package com.haochang.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @description: 描述：lock测试
 * @author: youzhi.gao
 * @date: 2020-10-29 09:49
 */
public class T_01 {
    static Thread t1=null,t2=null;
    public static void main(String[] args) {
        char[] aI="1234567".toCharArray();
        char[] aC="ABCDEFG".toCharArray();
         t1=new Thread(()->{
            for(char c:aI){
                LockSupport.park(t1); //阻塞t1
                System.out.print(c);
                LockSupport.unpark(t2);//唤醒t2
            }
        },"t1");

         t2=new Thread(()->{
            for(char c:aC){
                System.out.print(c);
                LockSupport.unpark(t1);//唤醒t1
                LockSupport.park(t2);//阻塞t2
            }
        },"t2");
        t1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();

    }
}
