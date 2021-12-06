package com.example.redisdemo.Controller;

import com.example.redisdemo.Pojo.User;
import com.example.redisdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:RedisController
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:03:33
 */
@RestController
@RequestMapping("/user")
public class RedisController {
    @Autowired
    UserService userService;
    @RequestMapping("/{id}")
    public User ForTest(@PathVariable String id)
    {
        return userService.selectUser(id);
    }
    @RequestMapping("/update/")
    public String update(User user)
    {
        userService.updateById(user);
        return "success";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable String id)
    {
        userService.deleteById(id);
        return "delete success";
    }
}
