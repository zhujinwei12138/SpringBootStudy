package com.example.rabbit_object.Mq;

import com.example.rabbit_object.Pojo.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FileName:ObjectSender
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:04:26
 */
@Component
public class ObjectSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(User user)
    {
        System.out.println("Sender object: "+user.toString());
        this.amqpTemplate.convertAndSend("object" ,user);
    }
 }
