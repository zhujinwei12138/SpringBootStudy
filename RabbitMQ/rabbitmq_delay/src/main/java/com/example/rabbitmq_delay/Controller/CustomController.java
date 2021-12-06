package com.example.rabbitmq_delay.Controller;

import com.example.rabbitmq_delay.Mq.CustomSender;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:CustomController
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 16:27:59
 */
@RestController
public class CustomController {
    @Autowired
    private CustomSender customSender;
    @GetMapping("/customSend")
    public void send()
    {
        customSender.sendMsg("delay_queue_1","支付超时");
    }
}
