package com.example.elasticsearchproduct.Repository;

import com.example.elasticsearchproduct.Entity.Product;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * FileName:ProductRepository
 * Author:zhujinwei
 * Date: 2021年12月01日 0001 14:59:10
 */

@Component
public interface ProductRepository extends ElasticsearchRepository<Product,Long> {
    Product findById(long id);
    Product findByName(String name);
}
