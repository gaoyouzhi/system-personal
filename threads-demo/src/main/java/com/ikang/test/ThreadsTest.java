package com.ikang.test;

import com.ikang.demo.ThreadPoll;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by gaoyouzhi on 2020/3/8.
 */
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Rollback(false)
public class ThreadsTest {
    @Test
    public void test(){
        List<Callable<String>> callables = new ArrayList<>();
        for(int i=0;i<10;i++){
            callables.add(()-> Math.random()+"");
        }
        List<String> res = ThreadPoll.addTask(callables);
        System.out.println("**********************");
        for(String str : res){
            System.out.println(str);
        }
    }
}
