package com.evergreen.scheduler.infra.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 실제 구조 생성 (Exchange, Queue, Binding)
 */
@Configuration
@RequiredArgsConstructor
public class RabbitMQTopologyConfig {

    private final RabbitMQProperties props;

    @Bean
    public TopicExchange notificationExchange() {
        return new TopicExchange(props.getExchange());
    }

    @Bean
    public Queue notificationQueue() {
        return new Queue(props.getQueue());
    }

    @Bean
    public Binding notificationBinding() {
        return BindingBuilder
            .bind(notificationQueue())
            .to(notificationExchange())
            .with(props.getRoutingKey());
    }
}
