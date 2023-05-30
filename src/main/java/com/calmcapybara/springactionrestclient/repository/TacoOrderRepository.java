package com.calmcapybara.springactionrestclient.repository;

import com.calmcapybara.springactionrestclient.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoOrderRepository extends CrudRepository<TacoOrder, Long> {
}
