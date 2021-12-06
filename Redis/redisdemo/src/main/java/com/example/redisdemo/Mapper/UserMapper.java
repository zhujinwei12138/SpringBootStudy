package com.example.redisdemo.Mapper;

import com.example.redisdemo.Pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * FileName:UserMapper
 * Author:zhujinwei
 * Date: 2021年11月29日 0029 10:03:22
 */
@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user(name,gae) values(#{name},#{age})")
    int addUser(@Param("name")String name,@Param("age")String age);

    @Select("select * from user where id=#{id}")
    User findById(@Param("id")String id);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    int updateById(User user);

    @Delete("delete from user where id=#{id}")
    void deleteById(@Param("id")String id);
}
