package com.example.javaonetomany.Service;

import com.example.javaonetomany.Entity.School;

import java.util.List;

/**
 * FileName:SchoolService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:18:08
 */
public interface SchoolService {
    public List<School> getSchoolList();

    public School findSchoolById(long id);
}
