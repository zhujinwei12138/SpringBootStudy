package com.example.jpaentity.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * FileName:Article
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 16:44:35
 */
@Entity
@Data
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    @NotEmpty()
    private String title;

    @Column(columnDefinition = "enum('图','图文','文')")
    private String type;
    private Boolean available = Boolean.FALSE;
    @Size(min = 0, max = 20)
    private String keyword;
    @Size(max = 255)
    private String description;
    @Column(nullable = false)
    private String body;
    @Transient
    private List kewwordlists;

    public List getKeywordlists() {
        return Arrays.asList(this.keyword.trim().split("|"));
    }

    public void setKeywordlists(List keywordlists) {
        this.kewwordlists = keywordlists;
    }
}
