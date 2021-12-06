package com.example.restful.Entity;

import lombok.Data;

import javax.persistence.*;

/**
 * FileName:Article
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:10:23
 */
@Entity
@Table(name = "article")
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String body;
}
