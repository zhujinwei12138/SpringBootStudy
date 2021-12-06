package com.example.jpaarticle.Service.Impl;

import com.example.jpaarticle.Entity.Article;
import com.example.jpaarticle.Repository.ArticleRepository;
import com.example.jpaarticle.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName:ArticleServiceImpl
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 08:47:54
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article findArticleById(long id) {

        return articleRepository.findById(id);
    }

    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }
}
