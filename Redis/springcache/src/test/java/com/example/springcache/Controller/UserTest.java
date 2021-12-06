package com.example.springcache.Controller;

import com.example.springcache.Pojo.User;

import com.example.springcache.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;





/**
 * FileName:RedisTypeTest
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:04:13
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertUser()throws  Exception
    {
        User user=new User();
        user.setUsername("zhujinwei");
        user.setPassword("159356");
        userService.insertUser(user);
    }
    @Test
    public void findUserById()throws  Exception
    {
        long id=5;
        User user=userService.findUserById(id);
        System.out.println(user.getId()+user.getUsername());
    }
}
