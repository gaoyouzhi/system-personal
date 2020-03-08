package com.ikang.demo;

import com.ikang.model.Student;
import com.ikang.service.StudentService;
import com.ikang.service.impl.StudentServiceImpl;
import com.sun.javafx.collections.MappingChange;
import sun.nio.ch.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * futureTask测试
 * @author gaoyouzhi
 * @date 2020/3/7
 */
public class FutureTaskDemo implements Callable<List<Student>> {

    private Integer begin;
    private Integer end;

    public FutureTaskDemo(Integer begin, Integer end) {
        this.begin = begin;
        this.end = end;
    }

    private StudentService studentService = new StudentServiceImpl();

    @Override
    public List<Student> call() throws Exception {
        return studentService.getStudentInfoByIds(begin, end);
    }
}
