package com.ikang.service;

import com.ikang.model.Student;

import java.util.List;

/**
 *
 * @author gaoyouzhi
 * @date 2020/3/7
 */
public interface StudentService {
    List<Student> getStudentInfoByIds(Integer begin, Integer end);

    Student getStudentInfoById(Integer id);
}
