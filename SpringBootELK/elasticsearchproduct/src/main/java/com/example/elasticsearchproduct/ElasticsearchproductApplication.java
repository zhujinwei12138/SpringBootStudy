package com.example.elasticsearchproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ElasticsearchproductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchproductApplication.class, args);
    }

}
