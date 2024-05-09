package com.peddrobatista.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peddrobatista.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
