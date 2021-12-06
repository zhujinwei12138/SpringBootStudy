package com.example.springmvcdemo.service;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName:MyCustomConstraint
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 17:33:34
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyCustomConstraintValidator.class)
public @interface MyCustomConstraint {
    String message() default "请输入中国政治或经济中心的城市名";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
