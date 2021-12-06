package com.example.elasticsearchproduct.Entity;

import com.example.elasticsearchproduct.Repository.ProductRepository;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * FileName:Product
 * Author:zhujinwei
 * Date: 2021年12月01日 0001 14:58:53
 */
@Document(indexName = "ec",type="product",replicas = 0,shards = 5)
//indexName索引名称 可以理解为数据库名 必须为小写 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
//type类型 可以理解为表名
@Data
public class Product implements Serializable {

    private Long id;
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private  String name;
    @Field(type = FieldType.Keyword)
    private String category;
    @Field(type = FieldType.Double)
    private Double price;
    @Field(index = false,type = FieldType.Keyword)
    private String images;
    private String body;
    public Product(Long id,String name,String category,Double price,String images,String body)
    {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.images = images;
        this.body = body;
    }
    public Product() {
    }
}
