package com.biblioteca.modelo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.repository.IAutorRepository;
import com.biblioteca.modelo.service.IAutorService;
@Service
public class AutorService implements IAutorService {

	@Autowired
	private IAutorRepository repository;
	
	@Override
	public List<Autor> findAll() {
		return repository.findAll();
	}

	@Override
	public void create(Autor autor) {
		repository.save(autor);
	}

	@Override
	public List<Autor> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	
	

}
