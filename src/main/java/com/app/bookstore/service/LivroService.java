package com.app.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookstore.model.Categoria;
import com.app.bookstore.model.Livro;
import com.app.bookstore.repositories.CategoriaRepository;
import com.app.bookstore.repositories.LivroRepository;
import com.app.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private CategoriaService categoriaService;
	
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", tipo: " + Livro.class.getName())); 
	}


	public List<Livro> findAll(Integer id_cat) {
		categoriaService.findById(id_cat);
		return livroRepository.findAllByCategoria(id_cat);
	}
}
