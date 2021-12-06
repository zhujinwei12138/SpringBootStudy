package com.example.rabbitmq_fanout.Mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:FanoutReceiverA
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:13:53
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {
    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver A:" + message);
    }

}
