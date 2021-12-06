package com.example.rabbitmq_delay;

import com.example.rabbitmq_delay.Mq.CustomSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;

/**
 * FileName:CustomControllerTest
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 16:42:57
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomControllerTest {
    /**
     * @Description: 测试 消息延迟
     */
    @Autowired
    private CustomSender customSender;
    @Test
    public void send() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        customSender.sendMsg("delay_queue_1","支付超时，取消订单通知！");
    }
}
