package com.clara.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clara.petshop.domain.Categoria;
import com.clara.petshop.repository.CategoriaRepository;

@Component
public class PopulaDados {

	@Autowired
	CategoriaRepository categoriaRepository; 
	
	@PostConstruct
	public void cadastrar() {
		
		Categoria cat1 = new Categoria(null, "Alimento");
		Categoria cat2 = new Categoria(null, "Cosmetico");
		Categoria cat3 = new Categoria(null, "Remedio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
}
