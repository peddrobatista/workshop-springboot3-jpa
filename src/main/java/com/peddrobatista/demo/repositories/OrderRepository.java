package com.peddrobatista.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peddrobatista.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
