package com.example.rabbitmq_topic.Controller;

import com.example.rabbitmq_topic.Mq.TopicSender;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:TopicSendController
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:41:16
 */
@RestController
public class TopicSendController {
    @Autowired
    private TopicSender sender;
    @GetMapping("topicsend")
    public void topic()
    {
        sender.send();
    }
    @GetMapping("topicsend2")
    public void topic2()
    {
        sender.send2();
    }
    @GetMapping("topicsend3")
    public void topic3()
    {
        sender.send3();
    }
}
