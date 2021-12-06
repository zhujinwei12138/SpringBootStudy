package com.example.restful.Service;

import com.example.restful.Entity.Article;

import java.util.List;

/**
 * FileName:ArticleService
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:12:30
 */
public interface ArticleService {
    public List<Article> getArticleList();
    public  Article findArticleById(long id);
}
