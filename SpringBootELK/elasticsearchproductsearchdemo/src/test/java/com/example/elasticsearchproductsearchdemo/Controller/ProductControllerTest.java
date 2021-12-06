package com.example.elasticsearchproductsearchdemo.Controller;

import com.example.elasticsearchproductsearchdemo.Entity.Product;
import com.example.elasticsearchproductsearchdemo.Repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:ProductControllerTest
 * Author:zhujinwei
 * Date: 2021年12月02日 0002 13:37:58
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductControllerTest {
    //每页数量
    private Integer PAGESIZE=10;
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void save() {
        long id= System.currentTimeMillis();
        Product product = new Product(id,
                "红富士","水果",7.99,"/img/p1.jpg","这是一个测试商品");
        productRepository.save(product);

        System.out.println(product.getId());
    }


    @Test
    public void getProduct() {
        Product product = productRepository.findByName("红富士");
        System.out.println(product.getId());

    }
    @Test
    public void update() {
        long id=1557032203515L;
        Product product = new Product(id,
                "金帅","水果",7.99,"/img/p1.jpg","金帅也和红富士一样，非常好吃，脆脆的");
        productRepository.save(product);
    }

    @Test
    public void getProductById() {
        Product product = productRepository.findById(1557032203515L);
        System.out.println(product.getName()+product.getBody());
    }
    @Test
    public void delete() {
        long id=1557032203515L;
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
