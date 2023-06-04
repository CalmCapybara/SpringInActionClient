package com.calmcapybara.springactionclient.service.impl;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import com.calmcapybara.springactionclient.service.OrderReceiver;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsOrderReceiver implements OrderReceiver {
    final
    JmsTemplate jmsTemplate;

    public JmsOrderReceiver(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public TacoOrder receiveOrder() {
        return (TacoOrder) jmsTemplate.receiveAndConvert("calmCapybara.oder");
    }
}
