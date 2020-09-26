package com.haochang.test;

import sun.misc.Unsafe;

/**
 * @description: 描述：测试sync
 * @author: youzhi.gao
 * @date: 2020-09-23 13:47
 */
public class SyncTest {
    private static int sum = 0;
    private Object obj;
    public static void main(String[] args) {
        add();
    }

    private synchronized static void add() {
        sum++;
    }

    private void add1(){
        synchronized (this){
            sum++;
        }
    }

    private void add2(){

        Unsafe.getUnsafe().monitorEnter(obj);
        sum++;
    }

    private void add3(){
        Unsafe.getUnsafe().monitorExit(obj);
    }

    public void test1(){
        Thread thread = new Thread(()->sum++);
        thread.start();

        Unsafe.getUnsafe().compareAndSwapInt(obj, 2, 3, 4);
    }
}
