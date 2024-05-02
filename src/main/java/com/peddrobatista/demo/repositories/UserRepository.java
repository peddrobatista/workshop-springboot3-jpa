package com.peddrobatista.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peddrobatista.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
