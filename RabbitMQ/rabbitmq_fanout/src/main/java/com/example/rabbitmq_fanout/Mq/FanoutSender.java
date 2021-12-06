package com.example.rabbitmq_fanout.Mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FileName:FanoutSender
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:14:09
 */
@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() throws Exception{
        String context = "Fanout ";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("fanoutExchanger","", context);
    }
}
