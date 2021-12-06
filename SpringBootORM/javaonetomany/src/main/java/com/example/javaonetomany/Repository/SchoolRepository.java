package com.example.javaonetomany.Repository;

import com.example.javaonetomany.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FileName:SchoolRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:17:57
 */
public interface SchoolRepository extends JpaRepository<School, Long> {
    School findSchoolById(long id);

    void deleteById(long id);
}
