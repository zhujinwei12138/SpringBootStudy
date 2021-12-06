package com.example.rabbitmq_fanout.Controller;

import com.example.rabbitmq_fanout.Mq.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:FanoutSendController
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 15:13:44
 */
@RestController
public class FanoutSendController {
    @Autowired
    private FanoutSender sender;

    @GetMapping("/FanoutSend")
    public void fanoutSender() throws Exception {
        sender.send();
    }
}
