package com.example.rabbitmq_queue;

import com.example.rabbitmq_queue.Mq.SenderA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * FileName:MQTest
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 13:53:13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MQTest {
    @Autowired
    private SenderA senderA;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void QueueSend()
    {
        int i=2;
        for(int j=0;j<i;++j)
        {
            String msg="Queue1 msg"+j+new Date();
            try
            {
                senderA.send(msg);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void send()
    {
        Message message= MessageBuilder.withBody("body content".getBytes())
                .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN)
                .setMessageId("1")
                .setHeader("header","header")
                .build();
        amqpTemplate.send("Queue1",message);
        amqpTemplate.convertAndSend("Queue1","body content");

    }

}
