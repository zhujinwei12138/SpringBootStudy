package com.example.elasticsearchproductsearchdemo.Controller;

import com.example.elasticsearchproductsearchdemo.Entity.Product;
import com.example.elasticsearchproductsearchdemo.Repository.ProductRepository;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:FuzzySearchTest
 * Author:zhujinwei
 * Date: 2021年12月02日 0002 13:37:49
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FuzzySearchTest {
    @Autowired
    private ProductRepository productRepository;
    @Test
    /**
     * Description: 左右模糊。
     */
    public void queryStringQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.queryStringQuery("我觉得红富士好吃").field("name"));
        // 搜索，获取结果
        Page<Product> products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Test
    /**
     * Description: 前缀查询prefixQuery。
     */
    public void prefixQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.prefixQuery("name","士"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }

    }

    @Test
    /**
     * Description: 分词模糊查询。
     */
    public void fuzzyQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.fuzzyQuery("name","士").fuzziness(Fuzziness.ONE));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }

    }
    @Test
    /**
     * Description: 通配符查询wildcard query。
     */
    public void wildcardQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.wildcardQuery("name","金*"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Test
    /**
     * Description: 通配符查询wildcard query。
     */
    public void wildcardQuery2() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.wildcardQuery("name","金?"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Test
    /**
     * Description:相似内容查询。
     */
    public void moreLikeThisQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.moreLikeThisQuery(new String[]{"name"}, new String[]{"红"}, null));
        // 搜索，获取结果
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }
    @Test
    /**
     * Description:相似内容查询。
     */
    public void multiMoreLikeThisQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.moreLikeThisQuery(new String[]{"name"}, new String[]{"红"}, null));
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.moreLikeThisQuery(new String[]{"name"}, new String[]{"红"}, null));
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.moreLikeThisQuery(new String[]{"name"}, new String[]{"红"}, null));
        // 搜索，获取结果
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

}