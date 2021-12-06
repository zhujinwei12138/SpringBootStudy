package com.example.javaonetomany.Entity;

import lombok.Data;

import javax.persistence.*;

/**
 * FileName:Teacher
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:17:07
 */
@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private School school;
}
