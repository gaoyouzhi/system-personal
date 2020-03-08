package com.ikang.service.impl;

import com.ikang.model.Student;
import com.ikang.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoyouzhi on 2020/3/7.
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> getStudentInfoByIds(List<Integer> ids) {
        List<Student> list = new ArrayList<>();

        for (int i = 1; i < Integer.MAX_VALUE; i ++){
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
