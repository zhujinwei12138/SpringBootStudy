package com.example.elasticsearchproductsearchdemo.Controller;

import com.example.elasticsearchproductsearchdemo.Entity.Product;
import com.example.elasticsearchproductsearchdemo.Repository.ProductRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:ByPageTest
 * Author:zhujinwei
 * Date: 2021年12月02日 0002 13:37:41
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ByPageTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    /**
     * Description: 分页查询
     */
    public void termQuery() {
        // 分页：
        int page = 0;
        int size = 1;//每页文档数

        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termQuery("name", "富"));
        // 搜索，获取结果
        nativeSearchQueryBuilderQueryBuilder.withPageable(PageRequest.of(page, size));
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }

    }


    @Test
    /**
     * Description: 分页查询+排序
     */
    public void searchByPageAndSort() {
        // 分页：
        int page = 0;
        int size = 5;//每页文档数

        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termQuery("name", "富"));
        // 搜索，获取结果
        nativeSearchQueryBuilderQueryBuilder.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC));
        nativeSearchQueryBuilderQueryBuilder.withPageable(PageRequest.of(page, size));
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }

    }


}