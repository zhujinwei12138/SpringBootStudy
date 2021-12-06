package com.example.rabbitmq_fanout.Mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:FanoutReceiverB
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:14:00
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {
    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver B:" + message);
    }

}
