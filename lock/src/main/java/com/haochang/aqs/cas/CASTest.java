package com.haochang.aqs.cas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CASTest {
    private static int sum = 0;
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0;i < 3; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        lock.lock();
                        sum++;
                    }finally {
                        lock.unlock();
                    }

                }
            });
            thread.start();
        }
    }
}
