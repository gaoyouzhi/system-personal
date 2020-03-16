package com.haochang.demo;

import com.haochang.model.Student;
import com.haochang.service.StudentService;
import com.haochang.service.impl.StudentServiceImpl;

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
