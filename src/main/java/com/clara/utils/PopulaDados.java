package com.clara.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clara.petshop.Produto;
import com.clara.petshop.domain.Categoria;
import com.clara.petshop.repository.CategoriaRepository;
import com.clara.petshop.repository.ProdutoRepository2;

@Component
public class PopulaDados {

	@Autowired
	CategoriaRepository categoriaRepository; 
	
	@Autowired
	ProdutoRepository2 produtoRepository2;
	
	@PostConstruct
	public void cadastrar() {
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "Remedio");
		Categoria cat3 = new Categoria(null, "Cosmetico");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		Produto p1 = new Produto(null,"Racao", 100.0);
		Produto p2 = new Produto(null,"Sache", 80.0);
		Produto p3 = new Produto(null,"Shampoo", 50.0);
		Produto p1 = new Produto(null,"Vermifugo", 20.0);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2)); 
		cat2.getProdutos().addAll(Arrays.asList(p3,p4)); 
		cat3.getProdutos().addAll(Arrays.asList(p4));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		p4.getCategorias().addAll(Arrays.asList(cat2, cat3));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository2.saveAll(Arrays.asList(p1,p2,p3,p4));
	}
	
}
