package com.example.springmvcdemo.service;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * FileName:MyCustomConstraintValidator
 * Author:zhujinwei
 * Date: 2021年11月16日 0016 17:35:44
 */
public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstraint, String> {

    @Override
    public void initialize(MyCustomConstraint myConstraint) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext validatorContext) {
        if (!(s.equals("北京") || s.equals("上海"))) {
            return false;
        }
        return true;
    }
}
