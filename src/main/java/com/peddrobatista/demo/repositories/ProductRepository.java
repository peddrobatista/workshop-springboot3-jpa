package com.peddrobatista.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peddrobatista.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
