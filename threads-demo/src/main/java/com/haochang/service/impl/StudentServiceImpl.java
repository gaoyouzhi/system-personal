package com.haochang.service.impl;

import com.haochang.model.Student;
import com.haochang.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyouzhi on 2020/3/7.
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> getStudentInfoByIds(Integer begin, Integer end) {
        List<Student> list = new ArrayList<>();

        if(begin < 0 || end < 0 || begin < end) {
            return list;
        }
        for (int i = begin; i < end; i ++){
            Student student = new Student();
            student.setId(i);
            student.setName("student" + i);
            list.add(student);
        }
        return list;
    }

    @Override
    public Student getStudentInfoById(Integer id) {
        Student student = new Student();
        student.setId(id);
        student.setName("stu-" + id);
        return student;
    }
}
