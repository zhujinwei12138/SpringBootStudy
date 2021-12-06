package com.example.springcache.Repository;

import com.example.springcache.Pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FileName:UserRepository
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 16:50:01
 */
public interface UserRepository extends JpaRepository<User,Long> {
     User findUserById(long id);
}
