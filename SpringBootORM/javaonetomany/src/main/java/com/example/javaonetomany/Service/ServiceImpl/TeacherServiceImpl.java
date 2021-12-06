package com.example.javaonetomany.Service.ServiceImpl;

import com.example.javaonetomany.Entity.Teacher;
import com.example.javaonetomany.Repository.TeacherRepository;
import com.example.javaonetomany.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * FileName:TeacherServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:18:45
 */
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findTeacherById(long id) {
        return teacherRepository.findTeacherById(id);
    }
}
