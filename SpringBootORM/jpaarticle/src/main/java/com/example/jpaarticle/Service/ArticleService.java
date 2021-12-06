package com.example.jpaarticle.Service;

import com.example.jpaarticle.Entity.Article;

import java.util.List;

/**
 * FileName:ArticleService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 08:47:37
 */
public interface ArticleService {
    public List<Article> getArticleList();

    public Article findArticleById(long id);
}
