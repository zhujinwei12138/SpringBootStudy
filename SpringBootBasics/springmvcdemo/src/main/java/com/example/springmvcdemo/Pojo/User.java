package com.example.springmvcdemo.Pojo;

import com.example.springmvcdemo.service.MyCustomConstraint;
import lombok.Data;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 16:58:11
 */
@Data
public class User implements Serializable {
    @NotBlank(message = "用户名不为空")
    @Length(min = 5, max = 10, message = "用户名长度为5-10个字符")
    private String name;

    private Long id;
    @NotNull(message = "年龄不为空")
    @Min(value = 18, message = "最小18岁")
    @Max(value = 80, message = "最大80岁")
    private Integer age;
    @Email(message = "请输入邮箱")
    @NotBlank(message = "邮箱不能为空")
    private String email;
    @MyCustomConstraint
    private String answer;
}
