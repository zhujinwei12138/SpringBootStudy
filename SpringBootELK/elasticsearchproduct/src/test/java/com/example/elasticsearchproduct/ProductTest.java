package com.example.elasticsearchproduct;

import com.example.elasticsearchproduct.Entity.Product;
import com.example.elasticsearchproduct.Repository.ProductRepository;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:ProductTest
 * Author:zhujinwei
 * Date: 2021年12月01日 0001 15:06:21
 */
@SpringBootTest
public class ProductTest {
    //每页数量
    private Integer PAGESIZE=10;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void save() {
        long id= 1;
         System.out.println(id+"\n\n\n\n\n\n\n");
        Product product = new Product(id,
                "红富士","水果",7.99,"/img/p1.jpg","这是一个测试商品");
        System.out.println(product);
        productRepository.save(product);


    }


    @Test
    public void getProduct() {
        Product product = productRepository.findByName("红富士");
        System.out.println(product.getId());

    }
    @Test
    public void update() {
        long id=1;
        Product product = new Product(id,
                "金帅","水果",7.99,"/img/p1.jpg","金帅也和红富士一样，非常好吃，脆脆的");
        productRepository.save(product);
    }

    @Test
    public void getProductById() {
        Product product = productRepository.findById(1);
        System.out.println(product.getName()+product.getBody());
    }
    @Test
    public void delete() {
        long id=1;
        productRepository.deleteById(id);
    }

    @Test
    public void getAll() {
        Iterable<Product> list = productRepository.findAll(Sort.by("id").ascending());
        for (Product product : list) {
            System.out.println(product);
        }

    }
}
