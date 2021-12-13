package com.biblioteca.modelo.service;

import java.util.List;

import com.biblioteca.modelo.entity.Libro;

public interface ILibroService {
	
	List<Libro> findAll();
	void create(Libro libro);
	

}
