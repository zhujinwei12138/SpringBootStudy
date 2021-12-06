package com.example.jdbc.Model;

import lombok.Data;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 15:13:36
 */
@Data
public class User implements RowMapper<User> {
    private int id;
    private String username;
    private String password;

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }

}
