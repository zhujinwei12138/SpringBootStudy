package com.example.rabbit_object.Mq;

import com.example.rabbit_object.Pojo.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:ObjectReceiver
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:04:16
 */
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    @RabbitHandler
    public void process(User user)
    {
        System.out.println("Receiver object: "+user);
    }
}
