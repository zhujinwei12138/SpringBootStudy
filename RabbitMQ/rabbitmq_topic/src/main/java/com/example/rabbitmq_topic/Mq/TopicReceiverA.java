package com.example.rabbitmq_topic.Mq;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:TopicReceiverA
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:41:35
 */
@Component
@RabbitListener(queues = "topic.a")
public class TopicReceiverA {
    @RabbitHandler
    public void process(String msg)
    {
        System.out.println("Topic ReceiverA: "+msg);
    }
}
