package com.baozistore.baozistore.repository;

import com.baozistore.baozistore.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}