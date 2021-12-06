package com.example.rabbitmq_queue.Mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FileName:SenderA
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 13:36:10
 */
@Component
public class SenderA {
     @Autowired
     private AmqpTemplate rabbitTemplate;

     public void send(String context)
     {
         System.out.println("Sender: "+context);
         this.rabbitTemplate.convertAndSend("Queue1",context);
     }
}
