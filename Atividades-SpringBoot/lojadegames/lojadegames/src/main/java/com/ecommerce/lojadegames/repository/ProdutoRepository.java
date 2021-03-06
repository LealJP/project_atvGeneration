package com.ecommerce.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findByDescricaoContaining(String descricao);
}
