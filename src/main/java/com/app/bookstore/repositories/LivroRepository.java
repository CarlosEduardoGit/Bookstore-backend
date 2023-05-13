package com.app.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bookstore.model.Categoria;
import com.app.bookstore.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
