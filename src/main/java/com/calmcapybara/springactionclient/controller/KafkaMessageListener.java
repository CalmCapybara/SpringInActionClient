package com.calmcapybara.springactionclient.controller;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id="TacoGroup", topics = "springInAction.topic", containerFactory = "containerFactory")
public class KafkaMessageListener {

    @KafkaHandler
    public void OrderListener(TacoOrder order) {
        System.out.println(order.getId());
    }
}
