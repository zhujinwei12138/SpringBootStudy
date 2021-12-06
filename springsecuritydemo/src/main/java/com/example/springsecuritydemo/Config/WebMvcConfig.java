package com.example.springsecuritydemo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * FileName:WebMvcConfig
 * Author:zhujinwei
 * Date: 2021年11月26日 0026 09:18:56
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/home").setViewName("springsecurity/home");
        registry.addViewController("/").setViewName("springsecurity/welcome");
        registry.addViewController("/login").setViewName("springsecurity/login");
    }
}
