package com.example.springcache.Pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:02:49
 */
@Entity
@Data
@Table(name = "user_cache_demo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    public User()
    {

    }

}
