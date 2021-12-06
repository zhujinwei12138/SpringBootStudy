package com.example.javaonetomany.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * FileName:School
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 14:17:01
 */
@Entity
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    //@OneToMany(cascade = CascadeType.ALL)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id")
    private List<Teacher> teacherList;
}
