package com.example.mybits.Controller;

import com.example.mybits.Entity.User;
import com.example.mybits.Mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:UserListControllerb
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:30:12
 */
@RestController
public class UserListControllerb {
    @Autowired
    UserMapper userMapper;

    //http://localhost:8080/listall2?pageNum=1&pageSize=2
    @RequestMapping("/listall2")
    public Page<User> getUserList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> userList = userMapper.getUserList();
        return userList;
    }
}
