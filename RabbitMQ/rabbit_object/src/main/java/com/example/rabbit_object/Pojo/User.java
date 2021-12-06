package com.example.rabbit_object.Pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:04:30
 */
@Data
public class User implements Serializable {
  private String name;
  private String age;
}
