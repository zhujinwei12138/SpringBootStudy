package com.example.rabbitmq_queue.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:RabbitmqConfig
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 13:35:36
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue queue()
    {
        return new Queue("Queue1");
    }
}
