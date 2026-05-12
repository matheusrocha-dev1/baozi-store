package com.baozistore.baozistore.repository;

import com.baozistore.baozistore.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}