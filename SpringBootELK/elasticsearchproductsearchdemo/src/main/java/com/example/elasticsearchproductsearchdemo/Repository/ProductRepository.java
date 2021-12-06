package com.example.elasticsearchproductsearchdemo.Repository;

import com.example.elasticsearchproductsearchdemo.Entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FileName:ProductRepository
 * Author:zhujinwei
 * Date: 2021年12月02日 0002 13:37:07
 */
@Component
public interface ProductRepository extends ElasticsearchRepository<Product,Long> {
    Product findById(long id);
    Product findByName(String name);
    List<Product> findByPriceBetween(double price1, double price2);
}