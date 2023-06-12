//package com.calmcapybara.springactionclient.controller;
//
//import com.calmcapybara.springactionclient.entity.TacoOrder;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitMessageListner {
//
//    @RabbitListener(queues = "calmCapybara.oder.queue")
//    public void OrderListener(TacoOrder order) {
//        System.out.println(order.getId());
//    }
//}
