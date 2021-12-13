package com.biblioteca.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.entity.Libro;
import com.biblioteca.modelo.entity.Nacionalidad;
import com.biblioteca.modelo.service.ILibroService;

@RequestMapping("/home")
@Controller
public class Home {
	
	@Autowired
	private ILibroService libroService;
	
	@GetMapping({"/","home",""})
	public String home() {
		return "index";
	}
	
	@PostConstruct
	private void initBBDD() {
		if(libroService.findAll().isEmpty()) {
			Autor paco = Autor.builder().nacionalidad(Nacionalidad.Español).nombre("Paco").build();
			Autor elfrances = Autor.builder().nacionalidad(Nacionalidad.Francés).nombre("El frances").build();
			List<Libro> libros=List.of(
					Libro.builder().ISBN("111").titulo("Libro 1").autor(paco).build(),
					Libro.builder().ISBN("222").titulo("Libro 2").autor(elfrances).build(),
					Libro.builder().ISBN("333").titulo("Libro 3").autor(elfrances).build());			
			
			libroService.createAll(libros);

		}
		
	}

}
