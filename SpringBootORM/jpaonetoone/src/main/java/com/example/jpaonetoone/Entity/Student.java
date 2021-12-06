package com.example.jpaonetoone.Entity;

import lombok.Data;

import javax.persistence.*;

/**
 * FileName:Student
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 13:16:09
 */
@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(columnDefinition = "enum('male','female')")
    private String sex;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private Card card;
}
