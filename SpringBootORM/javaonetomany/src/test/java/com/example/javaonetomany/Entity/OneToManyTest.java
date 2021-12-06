package com.example.javaonetomany.Entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.javaonetomany.Repository.SchoolRepository;
import com.example.javaonetomany.Repository.TeacherRepository;

import java.util.List;

/**
 * FileName:OneToManyTest
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:19:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OneToManyTest {

    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    public void add() {
        School school1 = new School();
        school1.setName("清华大学");
        schoolRepository.save(school1);
        Teacher teacher = new Teacher();
        teacher.setName("long");
        teacher.setSchool(school1);
        teacherRepository.save(teacher);
        Teacher teacher1 = new Teacher();
        teacher1.setName("zhujinwei");
        teacher1.setSchool(school1);
        teacherRepository.save(teacher1);
    }

    @Test
    public void find() {
        School school1 = new School();
        school1 = schoolRepository.findSchoolById(1);
        List<Teacher> teacherList = school1.getTeacherList();
        System.out.println(school1.getName());
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
        }
    }

    @Test
    public void deleteSchoolById() {
        schoolRepository.deleteById(1);
    }

    @Test
    public void deleteTeacherById() {
        teacherRepository.deleteById(1);
    }
}
