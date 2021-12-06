package com.example.jsr.Service;

import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;

/**
 * FileName:UserServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月26日 0026 10:00:21
 */
@Service
public class UserServiceImpl implements UserService{
   @Override
    public String addUser()
   {
       System.out.println("addUser");
       return null;
   }
    @Override
    @RolesAllowed({"ROLE_USER","ROLE_ADMIN"})
    public String updateUser()
   {
       System.out.println("updateuser");
       return null;
   }
    @Override
    @RolesAllowed("ROLE_ADMIN")
    public String deleteUser()
   {
       System.out.println("deleteuser");
       return null;
   }
}
