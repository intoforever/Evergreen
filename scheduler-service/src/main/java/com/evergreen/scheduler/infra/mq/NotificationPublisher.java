package com.evergreen.scheduler.infra.mq;

import com.evergreen.scheduler.domain.model.NotificationMessage;
import com.evergreen.scheduler.infra.config.RabbitMQProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationPublisher {

    private final AmqpTemplate rabbitTemplate;
    private final RabbitMQProperties props;

    public void send(NotificationMessage message) {
        rabbitTemplate.convertAndSend(
            props.getExchange(),    // notification.exchange
            props.getRoutingKey(),  // notification.key
            message                 // 직렬화된 JSON 메시지
        );
    }
}
