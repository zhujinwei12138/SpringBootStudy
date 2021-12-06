package com.example.rabbitmq_topic.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

/**
 * FileName:RabbitmqConfig
 * Author:zhujinwei
 * Date: 2021年11月30日 0030 14:41:03
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue queueMessage()
    {
        return new Queue("topic.a");
    }
    @Bean
    public Queue queueMessages()
    {
        return new Queue("topic.b");
    }
    @Bean
    TopicExchange exchange()
    {
        return new TopicExchange("topicExchange");
    }
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage,TopicExchange exchange)
    {
        return BindingBuilder.bind(queueMessage).to(exchange)
                .with("topic.a");
    }
    @Bean
    Binding bindingExchangeMessages(Queue queueMessage,TopicExchange exchange)
    {
        return BindingBuilder.bind(queueMessage).to(exchange)
                .with("topic.#");
    }


}
