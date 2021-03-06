package com.biblioteca.modelo.service;

import java.util.List;
import java.util.Optional;

import com.biblioteca.modelo.entity.Autor;

public interface IAutorService {
	
	List<Autor> findAll();
	void create(Autor autor);
	List<Autor> findByNombre(String nombre);
	Optional<Autor> findById(Long id);
}
