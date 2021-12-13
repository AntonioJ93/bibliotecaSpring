package com.biblioteca.modelo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.modelo.entity.Libro;
import com.biblioteca.modelo.repository.ILibroRepository;
import com.biblioteca.modelo.service.ILibroService;
@Service
public class LibroService implements ILibroService {

	@Autowired
	private ILibroRepository repository;
	
	@Override
	public List<Libro> findAll() {
		
		return repository.findAll();
	}

	@Override
	public void create(Libro libro) {
		
		repository.save(libro);
		
	}

}
