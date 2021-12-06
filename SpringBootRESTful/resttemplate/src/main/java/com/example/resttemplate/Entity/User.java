package com.example.resttemplate.Entity;

import lombok.Data;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月25日 0025 15:39:38
 */
@Data
public class User {
    private long id;
    private String name;

    public User() {
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;

    }
}
