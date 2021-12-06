package com.example.restful.Controller;

import com.example.restful.Exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ValidationException;

/**
 * FileName:TestController
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 16:18:20
 */
@RestController
public class TestController {
    @RequestMapping("/BusinessException")
    public String testResponseStatusExceptionResolver(@RequestParam("i") int i){
        if (i==0){
            throw new BusinessException(600,"自定义业务错误");
        }
        throw new ValidationException();

    }
}
