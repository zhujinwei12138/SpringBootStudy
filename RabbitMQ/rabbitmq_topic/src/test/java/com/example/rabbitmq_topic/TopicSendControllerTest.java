package com.example.rabbitmq_topic;

import com.example.rabbitmq_topic.Mq.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:TopicSendControllerTest
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:08:28
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TopicSendControllerTest {
    @Autowired
    private TopicSender sender;


    @Test
    public void topic() throws Exception {
        sender.send();
    }

    @Test
    public void topic1() throws Exception {
        sender.send2();
    }

    @Test
    public void topic2() throws Exception {
        sender.send3();
    }
}