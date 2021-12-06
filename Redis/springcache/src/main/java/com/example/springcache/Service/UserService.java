package com.example.springcache.Service;

import com.example.springcache.Pojo.User;

/**
 * FileName:UserService
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 16:49:43
 * @author Administrator
 */
public interface UserService {

    public User findUserById(long id);
    public User insertUser(User user);
    public User updateUserById(User user);
    public void deleteUserById(long id);
}
