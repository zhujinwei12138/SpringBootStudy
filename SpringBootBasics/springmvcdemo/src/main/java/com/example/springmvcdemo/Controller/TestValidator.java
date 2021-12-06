package com.example.springmvcdemo.Controller;

import com.example.springmvcdemo.Pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * FileName:TestValidator
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 17:19:54
 */
@Controller
public class TestValidator {
    @GetMapping("/test")
    public String showForm(User user) {
        return "form";
    }

    @GetMapping("/results")
    public String results() {
        return "results";
    }

    @PostMapping("/test")
    public String checkUser(@Valid User user, BindingResult bindingResult, RedirectAttributes attr) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        attr.addFlashAttribute("user", user);
        return "redirect:/results";
    }
}
