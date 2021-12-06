package com.example.rabbitmq_delay.Mq;

import com.example.rabbitmq_delay.Config.RabbitmqConfig;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FileName:CustomSender
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 16:28:13
 */
@Service
public class CustomSender {
   @Autowired
    private RabbitTemplate rabbitTemplate;
   public void sendMsg(String queueName,String msg)
   {
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       System.out.println("Sender: "+sdf.format(new Date()));
       rabbitTemplate.convertAndSend("delay_exchange", queueName, msg, new MessagePostProcessor() {
           @Override
           public Message postProcessMessage(Message message) throws AmqpException {
               message.getMessageProperties().setHeader("x-delay",60000);
               return message;
           }
       });
   }
}
