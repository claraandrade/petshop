package com.clara.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.clara.petshop.domain.Categoria;

@Repository
public interface ProdutoRepository2 extends JpaRepository<Categoria, Integer>{

}
