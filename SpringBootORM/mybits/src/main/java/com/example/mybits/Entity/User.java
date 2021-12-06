package com.example.mybits.Entity;

import lombok.Data;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:30:18
 */
//User（不同于JPA的点，不需要映射.JPA需要注解@entity）
@Data
public class User {
    private int id;
    private String name;
    private int age;
}
