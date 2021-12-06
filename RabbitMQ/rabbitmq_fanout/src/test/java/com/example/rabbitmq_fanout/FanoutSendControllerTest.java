package com.example.rabbitmq_fanout;

import com.example.rabbitmq_fanout.Mq.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:FanoutSendControllerTest
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:14:39
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FanoutSendControllerTest {
    @Autowired
    private FanoutSender sender;

    @Test
    public void fanoutSender() throws Exception {
        sender.send();
    }

}