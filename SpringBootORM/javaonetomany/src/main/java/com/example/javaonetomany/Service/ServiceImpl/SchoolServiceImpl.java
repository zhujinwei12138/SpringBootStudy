package com.example.javaonetomany.Service.ServiceImpl;

import com.example.javaonetomany.Entity.School;
import com.example.javaonetomany.Repository.SchoolRepository;
import com.example.javaonetomany.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * FileName:SchoolServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:18:30
 */
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<School> getSchoolList() {
        return schoolRepository.findAll();
    }

    @Override
    public School findSchoolById(long id) {
        return schoolRepository.findSchoolById(id);
    }

}
