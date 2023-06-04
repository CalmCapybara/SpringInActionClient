package com.calmcapybara.springactionclient.repository;

import com.calmcapybara.springactionclient.entity.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoOrderRepository extends CrudRepository<TacoOrder, Long> {
}
