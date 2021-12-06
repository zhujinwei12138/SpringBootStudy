package com.example.jpaonetoone.Service.Impl;

import com.example.jpaonetoone.Entity.Student;
import com.example.jpaonetoone.Repository.StudentRepository;
import com.example.jpaonetoone.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * FileName:StudentServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:17:48
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudentlist() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(long id) {
        return studentRepository.findById(id);
    }
}
