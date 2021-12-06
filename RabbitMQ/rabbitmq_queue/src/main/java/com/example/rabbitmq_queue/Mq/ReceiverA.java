package com.example.rabbitmq_queue.Mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FileName:ReceiverA
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 13:35:49
 */
@Component
@RabbitListener(queues = "Queue1")//监听QueueHello的消息队列
public class ReceiverA {
    @RabbitHandler//@RabbitHandler来实现具体消费
    public void QueueReceiver(String Queue1)
    {
        System.out.println("Receiver A: "+Queue1);
    }


}
