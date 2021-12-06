package com.example.jpaarticle.Repository;

import com.example.jpaarticle.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * FileName:ArticleRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 08:47:25
 */
public interface ArticleRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {
    Article findById(long id);
}
