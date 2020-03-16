package com.haochang.test;

import com.haochang.demo.FutureTaskDemo;
import com.haochang.model.Student;
import com.haochang.service.StudentService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        List<Callable<List<Student>>> callables = new ArrayList<>();
        for(int i=0;i<10;i++){
            callables.add(new FutureTaskDemo(i*1000, (i+1)*1000 - 1));
        }

    }
}
