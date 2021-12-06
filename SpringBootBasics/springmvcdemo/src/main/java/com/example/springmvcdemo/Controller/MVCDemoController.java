package com.example.springmvcdemo.Controller;

import com.example.springmvcdemo.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FileName:MVCDemoController
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 16:59:33
 */
@Controller
public class MVCDemoController {
    @GetMapping("/mvcdemo")
    public ModelAndView hello() {
        User user = new User();
        user.setName("朱金炜");
        user.setAge(21);
        ModelAndView modelAndView = new ModelAndView("mvcdemo");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
