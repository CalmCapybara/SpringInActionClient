package com.calmcapybara.springactionclient.service.impl;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import com.calmcapybara.springactionclient.service.OrderReceiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

@Service
public class RabbitOrderReceiver implements OrderReceiver {
    final
    RabbitTemplate rabbitTemplate;

    public RabbitOrderReceiver(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public TacoOrder receiveOrder() {
        return (TacoOrder) rabbitTemplate.receiveAndConvert("calmCapybara.oder.queue", new ParameterizedTypeReference<TacoOrder>() {});
    }
}
