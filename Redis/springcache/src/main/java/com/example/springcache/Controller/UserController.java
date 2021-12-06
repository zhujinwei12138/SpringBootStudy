package com.example.springcache.Controller;

import com.example.springcache.Pojo.User;
import com.example.springcache.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * FileName:UserController
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 16:50:34
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void insertUser() throws Exception {
        User user = new User();
        user.setUsername("zhujinwei");
        userService.insertUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable long id)throws Exception
    {
        User user =userService.findUserById(id);
        System.out.println(user.getId()+user.getUsername());
        return user;
    }
    @PutMapping("/{id}")
    public User updateUserById(User user)
    {
        return userService.updateUserById(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id)
    {
        userService.deleteUserById(id);
    }
}
