package com.example.rabbit_object.Controller;

import com.example.rabbit_object.Mq.ObjectSender;
import com.example.rabbit_object.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:ObjectSendController
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:04:01
 */
@RestController
public class ObjectSendController {
    @Autowired
    private ObjectSender objectSender;
    @GetMapping("/sendObject")
    public String sendObjectController()
    {
        try{
            User user=new User();
            user.setName("zhujinwei");
            user.setAge("22");
            objectSender.send(user);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "执行失败";
        }
        return "执行成功";
    }
}
