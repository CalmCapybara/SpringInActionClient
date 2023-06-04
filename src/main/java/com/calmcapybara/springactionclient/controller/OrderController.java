package com.calmcapybara.springactionclient.controller;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/orders")
    public ResponseEntity<TacoOrder> createOrder(@RequestBody TacoOrder order) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<TacoOrder> entity = new HttpEntity<>(order, headers);
        return restTemplate.exchange(
                "http://localhost:8080/api/orders",
                HttpMethod.POST,
                entity,
                TacoOrder.class);
    }
}
