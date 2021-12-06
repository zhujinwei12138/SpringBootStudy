package com.example.jpaarticle.Entity;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * FileName:Article
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 08:46:33
 */
@Entity
@Data
public class Article extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "标题不为空")
    private String title;
    @Column(nullable = false)
    private String body;
}
