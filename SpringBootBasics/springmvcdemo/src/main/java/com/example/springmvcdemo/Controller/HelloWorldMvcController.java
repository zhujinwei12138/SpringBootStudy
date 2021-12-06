package com.example.springmvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FileName:HelloWorldMvcController
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 16:37:15
 */
@Controller
public class HelloWorldMvcController {
    @RequestMapping("/hello")
    public String helloWorld(Model model) throws Exception {
        model.addAttribute("mav", "Hello,Spring Boot!我是MVC结构");
        return "example/hello";
    }
}
