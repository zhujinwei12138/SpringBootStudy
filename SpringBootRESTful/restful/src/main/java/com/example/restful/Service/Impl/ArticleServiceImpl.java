package com.example.restful.Service.Impl;

import com.example.restful.Repository.ArticleRepository;
import com.example.restful.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.restful.Entity.Article;
import java.util.List;

/**
 * FileName:ArticleServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:15:06
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }

    @Override
    public Article findArticleById(long id) {
        return articleRepository.findById(id);
    }

}
