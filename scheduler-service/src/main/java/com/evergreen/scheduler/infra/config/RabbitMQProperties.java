package com.evergreen.scheduler.infra.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * application.yml에 설정한 프로퍼티값 객체로 바인딩
 */
@Configuration
@ConfigurationProperties(prefix = "rabbitmq")
@Getter
public class RabbitMQProperties {
    private String exchange;
    private String routingKey;
    private String queue;
}
