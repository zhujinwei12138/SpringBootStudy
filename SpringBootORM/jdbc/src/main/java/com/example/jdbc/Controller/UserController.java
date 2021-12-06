package com.example.jdbc.Controller;

import com.example.jdbc.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * FileName:UserController
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 15:13:43
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("createtable")
    public String createtable() throws Exception {
        String sql = "CREATE TABLE `user` (\n" +
                "  `id` int(10) NOT NULL AUTO_INCREMENT,\n" +
                "  `username` varchar(100) DEFAULT NULL,\n" +
                "  `password` varchar(100) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;\n" +
                "\n";
        return "创建表成功";
    }

    @GetMapping("saveuser")
    public String saveuser() throws Exception {
        String sql = "INSERT INTO user (USERNAME,PASSWORD) VALUES ('zhujinwei','123456')";
        int rows = jdbcTemplate.update(sql);
        return "执行成功，影响" + rows + "行";
    }

    @GetMapping("batchsave")
    public String batchsave() throws Exception {
        String sql = "INSERT INTO user (USERNAME,PASSWORD) VALUES (?,?)";
        List<Object[]> arrayList = new ArrayList<>();
        for (int i = 0; i < 6; ++i) {
            String[] arr = new String[2];
            arr[0] = "zhujinwei";
            arr[1] = "123456";
            arrayList.add(arr);
        }
        jdbcTemplate.batchUpdate(sql, arrayList);
        return "执行成功";
    }

    @GetMapping("updatepassword")
    public String updatepassword(int id, String password) throws Exception {
        String sql = "update user set password=? where id=?";
        int rows = jdbcTemplate.update(sql, password, id);
        return "执行成功，影响" + rows + "行";
    }

    @GetMapping("deletebyid")
    public String deletebyid(int id) throws Exception {
        String sql = "delete from user where id=?";
        int rows = jdbcTemplate.update(sql, id);
        return "执行成功，影响" + rows + "行";
    }

    @GetMapping("getbyname")
    public List getbyname(String name) throws Exception {
        String sql = "select * from user where username=?";
        List<User> list = jdbcTemplate.query(sql, new User(), new Object[]{name});
        return list;
    }

    @GetMapping("getmapbyid")
    public Map getmapbyid(Integer id) throws Exception {
        String sql = "select * from user where id=?";
        Map map = jdbcTemplate.queryForMap(sql, id);
        return map;
    }

    @GetMapping("getuserbyid")
    public User getuserbyid(int id) throws Exception {
        String sql = "select * from user where id=?";
        User user = jdbcTemplate.queryForObject(sql, new User(), new Object[]{id});
        return user;
    }

    @GetMapping("list")
    public List<User> list() throws Exception {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
        return list;
    }


}
