package com.peddrobatista.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peddrobatista.demo.entities.OrderItem;
import com.peddrobatista.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
