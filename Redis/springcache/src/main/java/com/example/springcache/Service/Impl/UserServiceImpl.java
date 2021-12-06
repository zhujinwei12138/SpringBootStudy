package com.example.springcache.Service.Impl;

import com.example.springcache.Pojo.User;

import com.example.springcache.Repository.UserRepository;
import com.example.springcache.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * FileName:UserService
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:03:10
 */



@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable(key = "#id")
    public User findUserById(long id)
    {
        User user=userRepository.findUserById(id);
        return user;
    }
    @Override
    @CachePut(key = "#user.id")
    public User insertUser(User user)
    {
        user=this.userRepository.save(user);
        return user;
    }
    @Override
    @CachePut(key = "#user.id")
    public  User updateUserById(User user)
    {
        return userRepository.save(user);
    }
    @Override
    @CacheEvict(key = "#id")
    public void deleteUserById(long id)
    {
        userRepository.deleteById(id);
    }

}
