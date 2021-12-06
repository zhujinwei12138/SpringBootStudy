package com.example.rabbitmq_queue.Mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:ReceiverB
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 13:36:00
 */
@Component
@RabbitListener(queues = "Queue1")
public class ReceiverB {
    @RabbitHandler
    public void QueueReceiver(String Queue1)
    {
        System.out.println("Receiver B: "+Queue1);
    }
}
