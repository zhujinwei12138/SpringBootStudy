package com.example.rabbitmq_topic.Mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FileName:TopicSender
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:41:55
 */
@Component
public class TopicSender {
    @Autowired
    AmqpTemplate amqpTemplate;
    public void send()
    {
        String context ="topic ";
        System.out.println("Sender: "+context);
        this.amqpTemplate.convertAndSend("topicExchange","topic.1",context);
    }
    public void send2()
    {
        String c="topic 2";
        System.out.println("Sender: "+c);
        this.amqpTemplate.convertAndSend("topicExchange","topic.a",c);
    }
    public void send3()
    {
        String c="topic 3";
        System.out.println("Sender: "+c);
        this.amqpTemplate.convertAndSend("topicExchange","topic.b",c);
    }
}
