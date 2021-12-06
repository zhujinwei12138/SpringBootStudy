package com.example.rabbitmq_topic.Mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:TopicReceiverB
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:41:43
 */
@Component
@RabbitListener(queues = "topic.b")
public class TopicReceiverB {
    @RabbitHandler
    public void process(String msg)
    {
        System.out.println("Topic.b ReceiverB: "+msg);
    }
}
