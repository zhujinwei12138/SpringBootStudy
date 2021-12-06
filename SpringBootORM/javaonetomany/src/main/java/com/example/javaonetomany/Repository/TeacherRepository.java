package com.example.javaonetomany.Repository;

import com.example.javaonetomany.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FileName:TeacherRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:17:44
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findTeacherById(long id);

    void deleteById(long id);
}
