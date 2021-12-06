package com.example.jsr.Controller;

import com.example.jsr.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:UserController
 * Author:zhujinwei
 * Date: 2021年11月26日 0026 09:59:56
 */
@RestController
@RequestMapping("user")
public class UserController {
     @Autowired
    private UserService userService;
     @GetMapping("/addUser")
    public void addUser(){userService.addUser();}
    @GetMapping("/updateUser")
    public void updateUser(){userService.updateUser();}
    @GetMapping("/deleteUser")
    public void deleteUser(){userService.deleteUser();}
 }
