package com.example.jpaonetoone.Repository;

import com.example.jpaonetoone.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * FileName:StudentRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:16:55
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findById(long id);

    Student deleteById(long id);

    @Query("select a from Student a where a.name=?1")
    Student getStudentByMySelf(String name);

    @Query(value = "select * from stdu a where a.name = ?1", nativeQuery = true)
    Student getStudentByMySelf2(String name);


    @Modifying
    @Transactional
    @Query(value = "update Student a set a.name = '朱金炜' where a.id =:id")
    void updateUserByGuid(@Param("id") long id);

    @Modifying
    @Transactional
    @Query(value = "update Student a set a.name = :name where a.id =:id")
    void updateUserById(@Param("name") String name, @Param("id") long id);
}
