package com.example.resttemplate.Controller;

import com.example.resttemplate.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FileName:PutAndDeleteController
 * Author:zhujinwei
 * Date: 2021年11月25日 0025 15:39:26
 */
@RestController
public class PutAndDeleteController {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @RequestMapping("/put")
    public void put() {
        RestTemplate client= restTemplateBuilder.build();
        User user = new User();
        user.setName("hongwei");
        client.put("http://localhost:8080/{1}", user, 7);
    }
    @RequestMapping("/delete")
    public void delete() {
        RestTemplate client= restTemplateBuilder.build();
        client.delete("http://localhost:8080/{1}", 8);
    }

}
