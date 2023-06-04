package com.calmcapybara.springactionclient;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import com.calmcapybara.springactionclient.service.impl.JmsOrderReceiver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ComponentScan("com.calmcapybara.springactionclient")
public class MethodExecutorForTest extends SpringActionClientApplicationTests {

    @Autowired
    private JmsOrderReceiver jmsOrderReceiver;

    @Test
    public void receiveMessageFromArtemis() {
        TacoOrder tacoOrder = jmsOrderReceiver.receiveOrder();
        assertEquals(1L, tacoOrder.getId());
        System.out.println(tacoOrder);
    }
}
