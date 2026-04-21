package com.crud.avalicaoPratica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.avalicaoPratica.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}