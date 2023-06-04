package com.calmcapybara.springactionclient.service.impl;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import com.calmcapybara.springactionclient.repository.TacoOrderRepository;
import com.calmcapybara.springactionclient.service.TacoOrderService;
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
