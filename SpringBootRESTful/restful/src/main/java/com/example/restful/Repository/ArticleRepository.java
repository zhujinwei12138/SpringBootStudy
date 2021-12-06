package com.example.restful.Repository;

import com.example.restful.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * FileName:ArticleRepository
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:09:55
 */
public interface ArticleRepository extends JpaRepository<Article,Long>, JpaSpecificationExecutor<Article> {
    Article findById(long id);
}
