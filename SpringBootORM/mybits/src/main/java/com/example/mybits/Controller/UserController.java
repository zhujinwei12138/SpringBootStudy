package com.example.mybits.Controller;

import com.example.mybits.Entity.User;
import com.example.mybits.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName:UserController
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:29:44
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/querybyid")
    User queryById(int id) {
        return userMapper.queryById(id);
    }

    @RequestMapping("/")
    List<User> queryAll() {
        return userMapper.queryAll();
    }


    @RequestMapping("/add")
    String add(User user) {
        return userMapper.add(user) == 1 ? "success" : "failed";
    }

    @RequestMapping("/updatebyid")
    String updateById(User user) {
        return userMapper.updateById(user) == 1 ? "success" : "failed";
    }

    @RequestMapping("/delbyid")
    String delById(int id) {
        return userMapper.delById(id) == 1 ? "success" : "failed";
    }

}
