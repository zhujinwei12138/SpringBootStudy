package com.example.rabbitmq_delay.Config;

import org.omg.CosNaming._BindingIteratorImplBase;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.CustomExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName:RabbitmqConfig
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 16:27:51
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public CustomExchange delayExchange()
    {
        Map<String,Object> args=new HashMap<>();
        args.put("x-delayed-type","direct");
        return new CustomExchange("delay_exchange","x-delayed-message",true,false,args);
    }

    @Bean
    public Queue queue()
    {
        Queue queue=new Queue("delay_queue_1",true);
        return queue;

    }
    @Bean
    public Binding binding()
    {
        return BindingBuilder.bind(queue()).to(delayExchange()).with("delay_queue_1").noargs();
    }
}
