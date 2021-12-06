package com.example.rabbit_object.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:RabbitmqConfig
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:03:47
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}
