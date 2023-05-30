package com.calmcapybara.springactionrestclient.service.impl;

import com.calmcapybara.springactionrestclient.entity.TacoOrder;
import com.calmcapybara.springactionrestclient.repository.TacoOrderRepository;
import com.calmcapybara.springactionrestclient.service.TacoOrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TacoOrderServiceImpl implements TacoOrderService {
    TacoOrderRepository repository;

    @Override
    public TacoOrder getTacoOrder(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("no such Taco order"));
    }
}
