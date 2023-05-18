package com.app.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}


// Outra forma de instânciar os objetos Categoria e Livro


/*

package com.app.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.bookstore.model.Categoria;
import com.app.bookstore.model.Livro;
import com.app.bookstore.repositories.CategoriaRepository;
import com.app.bookstore.repositories.LivroRepository;


@SpringBootApplication
public class BookstoreApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	
	
	@Bean
	CommandLineRunner initDatabase(CategoriaRepository categoriaRepository, LivroRepository livroRepository ) {
		return args -> {
			categoriaRepository.deleteAll();
			livroRepository.deleteAll();
			
			Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
			
			Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);
			
			cat1.getLivros().addAll(Arrays.asList(l1));
			
			categoriaRepository.saveAll(Arrays.asList(cat1));
			livroRepository.saveAll(Arrays.asList(l1));
		};
		
	}

}

*/