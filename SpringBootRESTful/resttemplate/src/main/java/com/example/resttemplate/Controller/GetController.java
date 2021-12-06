package com.example.resttemplate.Controller;

import com.example.resttemplate.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName:GetController
 * Author:zhujinwei
 * Date: 2021年11月25日 0025 15:39:01
 */
@RestController
public class GetController {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    @RequestMapping("/nparameters")
    public String nparameters()
    {
        RestTemplate client=restTemplateBuilder.build();
        ResponseEntity<String> responseEntity=client.getForEntity("http://localhost:8080/getuser1", String.class);
        return responseEntity.getBody();
    }
    @RequestMapping("/withparameters1")
    //返回String,带参数
    public String withparameters1() {
        RestTemplate client= restTemplateBuilder.build();
        ResponseEntity<String> responseEntity = client.getForEntity("http://localhost:8080/getparameter?name={1}&id={2}", String.class, "hua",2);
        return responseEntity.getBody();
    }
    @RequestMapping("/withparameters2")
    //返回String,带参数
    public String withparameters2() {
        RestTemplate client= restTemplateBuilder.build();
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhonghuaLong");

        ResponseEntity<String> responseEntity = client.getForEntity("http://localhost:8080/getparameter?name={name}&id=3", String.class, map);
        return responseEntity.getBody();
    }

    @RequestMapping("/user1")
    //返回一个自定义类型的对象
    public User restUser1() {
        RestTemplate client= restTemplateBuilder.build();
        ResponseEntity<User> responseEntity = client.getForEntity("http://localhost:8080/getuser1", User.class);
        return responseEntity.getBody();
    }

    @RequestMapping("/getforobject")
    public User  getForObject() {
        RestTemplate client= restTemplateBuilder.build();
        User user = client.getForObject("http://localhost:8080/getuser1", User.class);
        return user;
    }
}
