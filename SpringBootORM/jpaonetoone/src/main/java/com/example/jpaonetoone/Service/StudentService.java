package com.example.jpaonetoone.Service;

import com.example.jpaonetoone.Entity.Student;

import java.util.List;

/**
 * FileName:StudentService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:17:21
 */
public interface StudentService {
    public List<Student> getStudentlist();

    public Student findStudentById(long id);
}
