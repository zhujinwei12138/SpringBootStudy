package com.example.javaonetomany.Service;

import com.example.javaonetomany.Entity.Teacher;

import java.util.List;

/**
 * FileName:TeacherService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:18:17
 */
public interface TeacherService {
    public List<Teacher> getTeacherList();

    public Teacher findTeacherById(long id);
}
