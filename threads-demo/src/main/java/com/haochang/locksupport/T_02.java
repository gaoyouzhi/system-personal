package com.haochang.locksupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 描述：t2
 * @author: youzhi.gao
 * @date: 2020-10-29 15:52
 */

public class T_02 {
//    @sun.misc.Contended
    //@Contended
    volatile static long r = 1;

//    private static final Logger logger = LoggerFactory.getLogger(T_02.class);
    public static void main(String[] args) throws InterruptedException {
        char[] aI = "ABCDEF".toCharArray();
        char[] aC = "123456".toCharArray();
        new Thread(() -> {
            for (char c : aC) {
                while (r == 1) {
                }
                System.out.print(c);
//                logger.info("{}",c);
                r = 1;
            }
        }, "t2").start();
//        Thread.sleep(1);
        new Thread(() -> {
            for (char c : aI) {
                while (r == 2) {
                }
                System.out.print(c);
//                logger.info("{}",c);
                r = 2;
            }
        }, "t1").start();
    }
}
