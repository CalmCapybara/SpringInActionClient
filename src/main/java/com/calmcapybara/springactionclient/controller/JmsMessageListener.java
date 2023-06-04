package com.calmcapybara.springactionclient.controller;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageListener {

    @JmsListener(destination = "calmCapybara.oder")
    public void TacoOrderListener(TacoOrder order) {
        System.out.println(order.getId());
    }
}
